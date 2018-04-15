package www.newproj.com.newpro;

import android.database.sqlite.SQLiteOpenHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by root on 5/3/18.
 */

public class DatabaseHandler extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "clientsData";

    // Contacts table name
    private static final String TABLE_CLIENTS = "clients";

    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_LNAME = "lastname";
    private static final String KEY_EMAIL = "email";
    private static final String KEY_MOBILE = "mobile";
    private static final String KEY_PASS = "password";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CLIENT = "CREATE TABLE " + TABLE_CLIENTS + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT," + KEY_LNAME + " TEXT," + KEY_EMAIL + " TEXT," + KEY_MOBILE +" TEXT,"+ KEY_PASS +" TEXT"  + ")";
        db.execSQL(CREATE_CLIENT);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CLIENTS);

        // Create tables again
        onCreate(db);
    }

    public void addClient(Clientdata clientdata) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("name", clientdata.getClient_name());
        values.put("lastname", clientdata.getClient_lastname());
        values.put("email",clientdata.getClient_emailid());
        values.put("mobile", clientdata.getClient_phone_number());
        values.put("password", clientdata.getClient_password());


        System.out.println("values: "+values);

        // Inserting Row
        db.insert(TABLE_CLIENTS, null, values);
        db.close(); // Closing database connection
    }


    public Clientdata getClient(String email) {
        SQLiteDatabase db = this.getReadableDatabase();
        Clientdata clientdata = null;

        Cursor cursor = db.query(TABLE_CLIENTS, new String[] { KEY_ID,
                        KEY_NAME, KEY_LNAME, KEY_EMAIL,KEY_MOBILE, KEY_PASS }, KEY_ID + "=?",
                new String[] { String.valueOf(email) }, null, null, null, null);
        System.out.println("Cursor : "+cursor);
        if(cursor != null && cursor.moveToFirst()){
            clientdata= new Clientdata(Integer.parseInt(cursor.getString(0)),
                    cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5));
        }else{
            System.out.println("No record found");
        }
        return clientdata;
    }

}
