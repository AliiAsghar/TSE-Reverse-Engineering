package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IFragmentWrapper extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IFragmentWrapper {
        static final int TRANSACTION_getActivity = 2;
        static final int TRANSACTION_getArguments = 3;
        static final int TRANSACTION_getId = 4;
        static final int TRANSACTION_getParentFragment = 5;
        static final int TRANSACTION_getResources = 6;
        static final int TRANSACTION_getRetainInstance = 7;
        static final int TRANSACTION_getTag = 8;
        static final int TRANSACTION_getTargetFragment = 9;
        static final int TRANSACTION_getTargetRequestCode = 10;
        static final int TRANSACTION_getUserVisibleHint = 11;
        static final int TRANSACTION_getView = 12;
        static final int TRANSACTION_isAdded = 13;
        static final int TRANSACTION_isDetached = 14;
        static final int TRANSACTION_isHidden = 15;
        static final int TRANSACTION_isInLayout = 16;
        static final int TRANSACTION_isRemoving = 17;
        static final int TRANSACTION_isResumed = 18;
        static final int TRANSACTION_isVisible = 19;
        static final int TRANSACTION_registerForContextMenu = 20;
        static final int TRANSACTION_setHasOptionsMenu = 21;
        static final int TRANSACTION_setMenuVisibility = 22;
        static final int TRANSACTION_setRetainInstance = 23;
        static final int TRANSACTION_setUserVisibleHint = 24;
        static final int TRANSACTION_startActivity = 25;
        static final int TRANSACTION_startActivityForResult = 26;
        static final int TRANSACTION_unregisterForContextMenu = 27;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IFragmentWrapper {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IFragmentWrapper");
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public IObjectWrapper getActivity() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public Bundle getArguments() {
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                Bundle bundle = (Bundle) iax.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public int getId() {
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public IFragmentWrapper getParentFragment() {
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                IFragmentWrapper asInterface = Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public IObjectWrapper getResources() {
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public boolean getRetainInstance() {
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public String getTag() {
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken());
                String readString = transactAndReadException.readString();
                transactAndReadException.recycle();
                return readString;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public IFragmentWrapper getTargetFragment() {
                Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken());
                IFragmentWrapper asInterface = Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public int getTargetRequestCode() {
                Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public boolean getUserVisibleHint() {
                Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public IObjectWrapper getView() {
                Parcel transactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken());
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public boolean isAdded() {
                Parcel transactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public boolean isDetached() {
                Parcel transactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public boolean isHidden() {
                Parcel transactAndReadException = transactAndReadException(15, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public boolean isInLayout() {
                Parcel transactAndReadException = transactAndReadException(16, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public boolean isRemoving() {
                Parcel transactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public boolean isResumed() {
                Parcel transactAndReadException = transactAndReadException(18, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public boolean isVisible() {
                Parcel transactAndReadException = transactAndReadException(19, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public void registerForContextMenu(IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(20, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public void setHasOptionsMenu(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(21, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public void setMenuVisibility(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(22, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public void setRetainInstance(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(23, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public void setUserVisibleHint(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(24, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public void startActivity(Intent intent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, intent);
                transactAndReadExceptionReturnVoid(25, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public void startActivityForResult(Intent intent, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, intent);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(26, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public void unregisterForContextMenu(IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(27, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        public static IFragmentWrapper asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            if (queryLocalInterface instanceof IFragmentWrapper) {
                return (IFragmentWrapper) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    IObjectWrapper activity = getActivity();
                    parcel2.writeNoException();
                    iax.f(parcel2, activity);
                    return true;
                case 3:
                    Bundle arguments = getArguments();
                    parcel2.writeNoException();
                    iax.e(parcel2, arguments);
                    return true;
                case 4:
                    int id = getId();
                    parcel2.writeNoException();
                    parcel2.writeInt(id);
                    return true;
                case 5:
                    IFragmentWrapper parentFragment = getParentFragment();
                    parcel2.writeNoException();
                    iax.f(parcel2, parentFragment);
                    return true;
                case 6:
                    IObjectWrapper resources = getResources();
                    parcel2.writeNoException();
                    iax.f(parcel2, resources);
                    return true;
                case 7:
                    boolean retainInstance = getRetainInstance();
                    parcel2.writeNoException();
                    int i3 = iax.a;
                    parcel2.writeInt(retainInstance ? 1 : 0);
                    return true;
                case 8:
                    String tag = getTag();
                    parcel2.writeNoException();
                    parcel2.writeString(tag);
                    return true;
                case 9:
                    IFragmentWrapper targetFragment = getTargetFragment();
                    parcel2.writeNoException();
                    iax.f(parcel2, targetFragment);
                    return true;
                case 10:
                    int targetRequestCode = getTargetRequestCode();
                    parcel2.writeNoException();
                    parcel2.writeInt(targetRequestCode);
                    return true;
                case 11:
                    boolean userVisibleHint = getUserVisibleHint();
                    parcel2.writeNoException();
                    int i4 = iax.a;
                    parcel2.writeInt(userVisibleHint ? 1 : 0);
                    return true;
                case 12:
                    IObjectWrapper view = getView();
                    parcel2.writeNoException();
                    iax.f(parcel2, view);
                    return true;
                case 13:
                    boolean isAdded = isAdded();
                    parcel2.writeNoException();
                    int i5 = iax.a;
                    parcel2.writeInt(isAdded ? 1 : 0);
                    return true;
                case 14:
                    boolean isDetached = isDetached();
                    parcel2.writeNoException();
                    int i6 = iax.a;
                    parcel2.writeInt(isDetached ? 1 : 0);
                    return true;
                case 15:
                    boolean isHidden = isHidden();
                    parcel2.writeNoException();
                    int i7 = iax.a;
                    parcel2.writeInt(isHidden ? 1 : 0);
                    return true;
                case 16:
                    boolean isInLayout = isInLayout();
                    parcel2.writeNoException();
                    int i8 = iax.a;
                    parcel2.writeInt(isInLayout ? 1 : 0);
                    return true;
                case 17:
                    boolean isRemoving = isRemoving();
                    parcel2.writeNoException();
                    int i9 = iax.a;
                    parcel2.writeInt(isRemoving ? 1 : 0);
                    return true;
                case 18:
                    boolean isResumed = isResumed();
                    parcel2.writeNoException();
                    int i10 = iax.a;
                    parcel2.writeInt(isResumed ? 1 : 0);
                    return true;
                case 19:
                    boolean isVisible = isVisible();
                    parcel2.writeNoException();
                    int i11 = iax.a;
                    parcel2.writeInt(isVisible ? 1 : 0);
                    return true;
                case 20:
                    IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    registerForContextMenu(asInterface);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean g = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setHasOptionsMenu(g);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean g2 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setMenuVisibility(g2);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean g3 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setRetainInstance(g3);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    boolean g4 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setUserVisibleHint(g4);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    Intent intent = (Intent) iax.a(parcel, Intent.CREATOR);
                    enforceNoDataAvail(parcel);
                    startActivity(intent);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    Intent intent2 = (Intent) iax.a(parcel, Intent.CREATOR);
                    int readInt = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    startActivityForResult(intent2, readInt);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    unregisterForContextMenu(asInterface2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    IObjectWrapper getActivity();

    Bundle getArguments();

    int getId();

    IFragmentWrapper getParentFragment();

    IObjectWrapper getResources();

    boolean getRetainInstance();

    String getTag();

    IFragmentWrapper getTargetFragment();

    int getTargetRequestCode();

    boolean getUserVisibleHint();

    IObjectWrapper getView();

    boolean isAdded();

    boolean isDetached();

    boolean isHidden();

    boolean isInLayout();

    boolean isRemoving();

    boolean isResumed();

    boolean isVisible();

    void registerForContextMenu(IObjectWrapper iObjectWrapper);

    void setHasOptionsMenu(boolean z);

    void setMenuVisibility(boolean z);

    void setRetainInstance(boolean z);

    void setUserVisibleHint(boolean z);

    void startActivity(Intent intent);

    void startActivityForResult(Intent intent, int i);

    void unregisterForContextMenu(IObjectWrapper iObjectWrapper);
}
