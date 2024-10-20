package com.google.android.gms.googlehelp.internal.common;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.SupportRequestHelp;
import com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IGoogleHelpService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IGoogleHelpService {
        static final int TRANSACTION_disablePipInCallingApp = 6;
        static final int TRANSACTION_getEscalationOptions = 14;
        static final int TRANSACTION_getRealtimeSupportStatus = 18;
        static final int TRANSACTION_getSuggestions = 13;
        static final int TRANSACTION_hidePipInCallingApp = 5;
        static final int TRANSACTION_processC2cSupportRequest = 12;
        static final int TRANSACTION_processChatSupportRequest = 11;
        static final int TRANSACTION_processGoogleHelp = 1;
        static final int TRANSACTION_processGoogleHelpAndPip = 2;
        static final int TRANSACTION_processInProductHelpAndPip = 17;
        static final int TRANSACTION_processTogglingPip = 3;
        static final int TRANSACTION_requestC2cSupport = 16;
        static final int TRANSACTION_requestChatSupport = 15;
        static final int TRANSACTION_saveAsyncFeedbackPsbd = 10;
        static final int TRANSACTION_saveAsyncFeedbackPsd = 9;
        static final int TRANSACTION_saveAsyncHelpPsd = 8;
        static final int TRANSACTION_showPipInCallingApp = 4;
        static final int TRANSACTION_showPipInCallingAppForActivityTitle = 7;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IGoogleHelpService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void disablePipInCallingApp(IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void getEscalationOptions(GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, googleHelp);
                iax.f(obtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactOneway(14, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void getRealtimeSupportStatus(GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, googleHelp);
                iax.f(obtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactOneway(18, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void getSuggestions(GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, googleHelp);
                iax.f(obtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactOneway(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void hidePipInCallingApp(IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void processC2cSupportRequest(GoogleHelp googleHelp, String str, String str2, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, googleHelp);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                iax.f(obtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactOneway(12, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void processChatSupportRequest(GoogleHelp googleHelp, String str, String str2, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, googleHelp);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                iax.f(obtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactOneway(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void processGoogleHelp(GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, googleHelp);
                iax.f(obtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void processGoogleHelpAndPip(GoogleHelp googleHelp, Bitmap bitmap, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, googleHelp);
                iax.d(obtainAndWriteInterfaceToken, bitmap);
                iax.f(obtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void processInProductHelpAndPip(InProductHelp inProductHelp, Bitmap bitmap, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, inProductHelp);
                iax.d(obtainAndWriteInterfaceToken, bitmap);
                iax.f(obtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactAndReadExceptionReturnVoid(17, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void processTogglingPip(Bitmap bitmap, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bitmap);
                iax.f(obtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void requestC2cSupport(SupportRequestHelp supportRequestHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, supportRequestHelp);
                iax.f(obtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactOneway(16, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void requestChatSupport(SupportRequestHelp supportRequestHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, supportRequestHelp);
                iax.f(obtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactOneway(15, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void saveAsyncFeedbackPsbd(FeedbackOptions feedbackOptions, Bundle bundle, long j, GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, feedbackOptions);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                obtainAndWriteInterfaceToken.writeLong(j);
                iax.d(obtainAndWriteInterfaceToken, googleHelp);
                iax.f(obtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactOneway(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void saveAsyncFeedbackPsd(Bundle bundle, long j, GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bundle);
                obtainAndWriteInterfaceToken.writeLong(j);
                iax.d(obtainAndWriteInterfaceToken, googleHelp);
                iax.f(obtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactOneway(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void saveAsyncHelpPsd(Bundle bundle, long j, GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bundle);
                obtainAndWriteInterfaceToken.writeLong(j);
                iax.d(obtainAndWriteInterfaceToken, googleHelp);
                iax.f(obtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactOneway(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void showPipInCallingApp(IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.googlehelp.internal.common.IGoogleHelpService
            public void showPipInCallingAppForActivityTitle(String str, IGoogleHelpCallbacks iGoogleHelpCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.f(obtainAndWriteInterfaceToken, iGoogleHelpCallbacks);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        }

        public static IGoogleHelpService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            if (queryLocalInterface instanceof IGoogleHelpService) {
                return (IGoogleHelpService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    GoogleHelp googleHelp = (GoogleHelp) iax.a(parcel, GoogleHelp.CREATOR);
                    IGoogleHelpCallbacks asInterface = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    processGoogleHelp(googleHelp, asInterface);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    GoogleHelp googleHelp2 = (GoogleHelp) iax.a(parcel, GoogleHelp.CREATOR);
                    Bitmap bitmap = (Bitmap) iax.a(parcel, Bitmap.CREATOR);
                    IGoogleHelpCallbacks asInterface2 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    processGoogleHelpAndPip(googleHelp2, bitmap, asInterface2);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    Bitmap bitmap2 = (Bitmap) iax.a(parcel, Bitmap.CREATOR);
                    IGoogleHelpCallbacks asInterface3 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    processTogglingPip(bitmap2, asInterface3);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    IGoogleHelpCallbacks asInterface4 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    showPipInCallingApp(asInterface4);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    IGoogleHelpCallbacks asInterface5 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    hidePipInCallingApp(asInterface5);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    IGoogleHelpCallbacks asInterface6 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    disablePipInCallingApp(asInterface6);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    String readString = parcel.readString();
                    IGoogleHelpCallbacks asInterface7 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    showPipInCallingAppForActivityTitle(readString, asInterface7);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    long readLong = parcel.readLong();
                    GoogleHelp googleHelp3 = (GoogleHelp) iax.a(parcel, GoogleHelp.CREATOR);
                    IGoogleHelpCallbacks asInterface8 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    saveAsyncHelpPsd(bundle, readLong, googleHelp3, asInterface8);
                    return true;
                case 9:
                    Bundle bundle2 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    long readLong2 = parcel.readLong();
                    GoogleHelp googleHelp4 = (GoogleHelp) iax.a(parcel, GoogleHelp.CREATOR);
                    IGoogleHelpCallbacks asInterface9 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    saveAsyncFeedbackPsd(bundle2, readLong2, googleHelp4, asInterface9);
                    return true;
                case 10:
                    FeedbackOptions feedbackOptions = (FeedbackOptions) iax.a(parcel, FeedbackOptions.CREATOR);
                    Bundle bundle3 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    long readLong3 = parcel.readLong();
                    GoogleHelp googleHelp5 = (GoogleHelp) iax.a(parcel, GoogleHelp.CREATOR);
                    IGoogleHelpCallbacks asInterface10 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    saveAsyncFeedbackPsbd(feedbackOptions, bundle3, readLong3, googleHelp5, asInterface10);
                    return true;
                case 11:
                    GoogleHelp googleHelp6 = (GoogleHelp) iax.a(parcel, GoogleHelp.CREATOR);
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    IGoogleHelpCallbacks asInterface11 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    processChatSupportRequest(googleHelp6, readString2, readString3, asInterface11);
                    return true;
                case 12:
                    GoogleHelp googleHelp7 = (GoogleHelp) iax.a(parcel, GoogleHelp.CREATOR);
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    IGoogleHelpCallbacks asInterface12 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    processC2cSupportRequest(googleHelp7, readString4, readString5, asInterface12);
                    return true;
                case 13:
                    GoogleHelp googleHelp8 = (GoogleHelp) iax.a(parcel, GoogleHelp.CREATOR);
                    IGoogleHelpCallbacks asInterface13 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getSuggestions(googleHelp8, asInterface13);
                    return true;
                case 14:
                    GoogleHelp googleHelp9 = (GoogleHelp) iax.a(parcel, GoogleHelp.CREATOR);
                    IGoogleHelpCallbacks asInterface14 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getEscalationOptions(googleHelp9, asInterface14);
                    return true;
                case 15:
                    SupportRequestHelp supportRequestHelp = (SupportRequestHelp) iax.a(parcel, SupportRequestHelp.CREATOR);
                    IGoogleHelpCallbacks asInterface15 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    requestChatSupport(supportRequestHelp, asInterface15);
                    return true;
                case 16:
                    SupportRequestHelp supportRequestHelp2 = (SupportRequestHelp) iax.a(parcel, SupportRequestHelp.CREATOR);
                    IGoogleHelpCallbacks asInterface16 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    requestC2cSupport(supportRequestHelp2, asInterface16);
                    return true;
                case 17:
                    InProductHelp inProductHelp = (InProductHelp) iax.a(parcel, InProductHelp.CREATOR);
                    Bitmap bitmap3 = (Bitmap) iax.a(parcel, Bitmap.CREATOR);
                    IGoogleHelpCallbacks asInterface17 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    processInProductHelpAndPip(inProductHelp, bitmap3, asInterface17);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    GoogleHelp googleHelp10 = (GoogleHelp) iax.a(parcel, GoogleHelp.CREATOR);
                    IGoogleHelpCallbacks asInterface18 = IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getRealtimeSupportStatus(googleHelp10, asInterface18);
                    return true;
                default:
                    return false;
            }
        }
    }

    @Deprecated
    void disablePipInCallingApp(IGoogleHelpCallbacks iGoogleHelpCallbacks);

    void getEscalationOptions(GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    void getRealtimeSupportStatus(GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    void getSuggestions(GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    @Deprecated
    void hidePipInCallingApp(IGoogleHelpCallbacks iGoogleHelpCallbacks);

    @Deprecated
    void processC2cSupportRequest(GoogleHelp googleHelp, String str, String str2, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    @Deprecated
    void processChatSupportRequest(GoogleHelp googleHelp, String str, String str2, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    void processGoogleHelp(GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    void processGoogleHelpAndPip(GoogleHelp googleHelp, Bitmap bitmap, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    void processInProductHelpAndPip(InProductHelp inProductHelp, Bitmap bitmap, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    @Deprecated
    void processTogglingPip(Bitmap bitmap, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    void requestC2cSupport(SupportRequestHelp supportRequestHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    void requestChatSupport(SupportRequestHelp supportRequestHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    void saveAsyncFeedbackPsbd(FeedbackOptions feedbackOptions, Bundle bundle, long j, GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    void saveAsyncFeedbackPsd(Bundle bundle, long j, GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    void saveAsyncHelpPsd(Bundle bundle, long j, GoogleHelp googleHelp, IGoogleHelpCallbacks iGoogleHelpCallbacks);

    @Deprecated
    void showPipInCallingApp(IGoogleHelpCallbacks iGoogleHelpCallbacks);

    @Deprecated
    void showPipInCallingAppForActivityTitle(String str, IGoogleHelpCallbacks iGoogleHelpCallbacks);
}
