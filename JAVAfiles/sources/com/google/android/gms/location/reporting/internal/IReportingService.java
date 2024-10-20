package com.google.android.gms.location.reporting.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.reporting.OptInRequest;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.gms.location.reporting.SendDataRequest;
import com.google.android.gms.location.reporting.UlrPrivateModeRequest;
import com.google.android.gms.location.reporting.UploadRequest;
import com.google.android.gms.location.reporting.UploadRequestResult;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IReportingService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IReportingService {
        static final int TRANSACTION_cancelUploadRequest = 4;
        static final int TRANSACTION_getReportingState = 1;
        static final int TRANSACTION_privateModeToggle = 8;
        static final int TRANSACTION_reportPlace = 5;
        static final int TRANSACTION_requestUpload = 3;
        static final int TRANSACTION_sendData = 7;
        static final int TRANSACTION_tryOptIn = 2;
        static final int TRANSACTION_tryOptInRequest = 6;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IReportingService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.location.reporting.internal.IReportingService");
            }

            @Override // com.google.android.gms.location.reporting.internal.IReportingService
            public int cancelUploadRequest(long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.location.reporting.internal.IReportingService
            public ReportingState getReportingState(Account account) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, account);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                ReportingState reportingState = (ReportingState) iax.a(transactAndReadException, ReportingState.CREATOR);
                transactAndReadException.recycle();
                return reportingState;
            }

            @Override // com.google.android.gms.location.reporting.internal.IReportingService
            public int privateModeToggle(UlrPrivateModeRequest ulrPrivateModeRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, ulrPrivateModeRequest);
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.location.reporting.internal.IReportingService
            public int reportPlace(Account account, PlaceReport placeReport) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, account);
                iax.d(obtainAndWriteInterfaceToken, placeReport);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.location.reporting.internal.IReportingService
            public UploadRequestResult requestUpload(UploadRequest uploadRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, uploadRequest);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                UploadRequestResult uploadRequestResult = (UploadRequestResult) iax.a(transactAndReadException, UploadRequestResult.CREATOR);
                transactAndReadException.recycle();
                return uploadRequestResult;
            }

            @Override // com.google.android.gms.location.reporting.internal.IReportingService
            public int sendData(Account account, SendDataRequest sendDataRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, account);
                iax.d(obtainAndWriteInterfaceToken, sendDataRequest);
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.location.reporting.internal.IReportingService
            public int tryOptIn(Account account) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, account);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.location.reporting.internal.IReportingService
            public int tryOptInRequest(OptInRequest optInRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, optInRequest);
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }
        }

        public Stub() {
            super("com.google.android.gms.location.reporting.internal.IReportingService");
        }

        public static IReportingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.reporting.internal.IReportingService");
            if (queryLocalInterface instanceof IReportingService) {
                return (IReportingService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    Account account = (Account) iax.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    ReportingState reportingState = getReportingState(account);
                    parcel2.writeNoException();
                    iax.e(parcel2, reportingState);
                    return true;
                case 2:
                    Account account2 = (Account) iax.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    int tryOptIn = tryOptIn(account2);
                    parcel2.writeNoException();
                    parcel2.writeInt(tryOptIn);
                    return true;
                case 3:
                    UploadRequest uploadRequest = (UploadRequest) iax.a(parcel, UploadRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    UploadRequestResult requestUpload = requestUpload(uploadRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, requestUpload);
                    return true;
                case 4:
                    long readLong = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    int cancelUploadRequest = cancelUploadRequest(readLong);
                    parcel2.writeNoException();
                    parcel2.writeInt(cancelUploadRequest);
                    return true;
                case 5:
                    Account account3 = (Account) iax.a(parcel, Account.CREATOR);
                    PlaceReport placeReport = (PlaceReport) iax.a(parcel, PlaceReport.CREATOR);
                    enforceNoDataAvail(parcel);
                    int reportPlace = reportPlace(account3, placeReport);
                    parcel2.writeNoException();
                    parcel2.writeInt(reportPlace);
                    return true;
                case 6:
                    OptInRequest optInRequest = (OptInRequest) iax.a(parcel, OptInRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    int tryOptInRequest = tryOptInRequest(optInRequest);
                    parcel2.writeNoException();
                    parcel2.writeInt(tryOptInRequest);
                    return true;
                case 7:
                    Account account4 = (Account) iax.a(parcel, Account.CREATOR);
                    SendDataRequest sendDataRequest = (SendDataRequest) iax.a(parcel, SendDataRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    int sendData = sendData(account4, sendDataRequest);
                    parcel2.writeNoException();
                    parcel2.writeInt(sendData);
                    return true;
                case 8:
                    UlrPrivateModeRequest ulrPrivateModeRequest = (UlrPrivateModeRequest) iax.a(parcel, UlrPrivateModeRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    int privateModeToggle = privateModeToggle(ulrPrivateModeRequest);
                    parcel2.writeNoException();
                    parcel2.writeInt(privateModeToggle);
                    return true;
                default:
                    return false;
            }
        }
    }

    int cancelUploadRequest(long j);

    ReportingState getReportingState(Account account);

    int privateModeToggle(UlrPrivateModeRequest ulrPrivateModeRequest);

    int reportPlace(Account account, PlaceReport placeReport);

    UploadRequestResult requestUpload(UploadRequest uploadRequest);

    int sendData(Account account, SendDataRequest sendDataRequest);

    int tryOptIn(Account account);

    int tryOptInRequest(OptInRequest optInRequest);
}
