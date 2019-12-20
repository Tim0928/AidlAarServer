package com.rextron.aidlaarserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        //hrow new UnsupportedOperationException("Not yet implemented");
        return mBinder;
    }
    private final IMyAidlInterface.Stub mBinder=new IMyAidlInterface.Stub() {
        @Override
        public int getAge() throws RemoteException {
            return 26;
        }

        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

        }
    };
}
