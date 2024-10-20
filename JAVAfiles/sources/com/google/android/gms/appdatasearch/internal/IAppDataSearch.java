package com.google.android.gms.appdatasearch.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.appdatasearch.DocumentResults;
import com.google.android.gms.appdatasearch.GlobalSearchApplication;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.appdatasearch.NativeApiInfo;
import com.google.android.gms.appdatasearch.PIMEUpdateResponse;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;
import com.google.android.gms.appdatasearch.PhraseAffinitySpecification;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RequestIndexingSpecification;
import com.google.android.gms.appdatasearch.ResultClickInfo;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.appdatasearch.StorageStats;
import com.google.android.gms.appdatasearch.SuggestSpecification;
import com.google.android.gms.appdatasearch.SuggestionResults;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IAppDataSearch extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IAppDataSearch {
        static final int TRANSACTION_blockPackages = 16;
        static final int TRANSACTION_clearUsageReportData = 33;
        static final int TRANSACTION_diagnostic = 9;
        static final int TRANSACTION_getAllCorpusNames = 27;
        static final int TRANSACTION_getCorpusHandlesRegisteredForIME = 22;
        static final int TRANSACTION_getCorpusInfo = 25;
        static final int TRANSACTION_getCorpusNames = 6;
        static final int TRANSACTION_getCorpusStatus = 5;
        static final int TRANSACTION_getCurrentExperimentIds = 31;
        static final int TRANSACTION_getDocuments = 3;
        static final int TRANSACTION_getGlobalSearchApps = 29;
        static final int TRANSACTION_getIMEUpdates = 23;
        static final int TRANSACTION_getNativeApiInfo = 34;
        static final int TRANSACTION_getPendingExperimentIds = 32;
        static final int TRANSACTION_getPhraseAffinity = 24;
        static final int TRANSACTION_getStorageStatistics = 28;
        static final int TRANSACTION_getUniversalSearchableApps = 13;
        static final int TRANSACTION_query = 1;
        static final int TRANSACTION_queryUniversal = 10;
        static final int TRANSACTION_registerCorpusInfo = 7;
        static final int TRANSACTION_registerCorpusInfo2 = 14;
        static final int TRANSACTION_registerIME = 20;
        static final int TRANSACTION_registerUniversalSearchableApp = 11;
        static final int TRANSACTION_reportResultClick = 19;
        static final int TRANSACTION_requestIndexing = 4;
        static final int TRANSACTION_setExperimentIds = 30;
        static final int TRANSACTION_setIncludeInGlobalSearch = 36;
        static final int TRANSACTION_suggest = 2;
        static final int TRANSACTION_triggerCompaction = 18;
        static final int TRANSACTION_unblockPackages = 17;
        static final int TRANSACTION_unregister = 8;
        static final int TRANSACTION_unregisterIME = 21;
        static final int TRANSACTION_unregisterUniversalSearchableApp = 12;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IAppDataSearch {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.appdatasearch.internal.IAppDataSearch");
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public void blockPackages(String[] strArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                transactAndReadExceptionReturnVoid(16, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public boolean clearUsageReportData() {
                Parcel transactAndReadException = transactAndReadException(33, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public Bundle diagnostic(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken);
                Bundle bundle2 = (Bundle) iax.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle2;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public String[] getAllCorpusNames(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(27, obtainAndWriteInterfaceToken);
                String[] createStringArray = transactAndReadException.createStringArray();
                transactAndReadException.recycle();
                return createStringArray;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public String[] getCorpusHandlesRegisteredForIME(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(22, obtainAndWriteInterfaceToken);
                String[] createStringArray = transactAndReadException.createStringArray();
                transactAndReadException.recycle();
                return createStringArray;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public RegisterCorpusInfo getCorpusInfo(String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                Parcel transactAndReadException = transactAndReadException(25, obtainAndWriteInterfaceToken);
                RegisterCorpusInfo registerCorpusInfo = (RegisterCorpusInfo) iax.a(transactAndReadException, RegisterCorpusInfo.CREATOR);
                transactAndReadException.recycle();
                return registerCorpusInfo;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public String[] getCorpusNames(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
                String[] createStringArray = transactAndReadException.createStringArray();
                transactAndReadException.recycle();
                return createStringArray;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public CorpusStatus getCorpusStatus(String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                CorpusStatus corpusStatus = (CorpusStatus) iax.a(transactAndReadException, CorpusStatus.CREATOR);
                transactAndReadException.recycle();
                return corpusStatus;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public int[] getCurrentExperimentIds() {
                Parcel transactAndReadException = transactAndReadException(31, obtainAndWriteInterfaceToken());
                int[] createIntArray = transactAndReadException.createIntArray();
                transactAndReadException.recycle();
                return createIntArray;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public DocumentResults getDocuments(String[] strArr, String str, String str2, QuerySpecification querySpecification) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                iax.d(obtainAndWriteInterfaceToken, querySpecification);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                DocumentResults documentResults = (DocumentResults) iax.a(transactAndReadException, DocumentResults.CREATOR);
                transactAndReadException.recycle();
                return documentResults;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public GlobalSearchApplication[] getGlobalSearchApps() {
                Parcel transactAndReadException = transactAndReadException(29, obtainAndWriteInterfaceToken());
                GlobalSearchApplication[] globalSearchApplicationArr = (GlobalSearchApplication[]) transactAndReadException.createTypedArray(GlobalSearchApplication.CREATOR);
                transactAndReadException.recycle();
                return globalSearchApplicationArr;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public PIMEUpdateResponse getIMEUpdates(String str, int i, byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                Parcel transactAndReadException = transactAndReadException(23, obtainAndWriteInterfaceToken);
                PIMEUpdateResponse pIMEUpdateResponse = (PIMEUpdateResponse) iax.a(transactAndReadException, PIMEUpdateResponse.CREATOR);
                transactAndReadException.recycle();
                return pIMEUpdateResponse;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public NativeApiInfo getNativeApiInfo() {
                Parcel transactAndReadException = transactAndReadException(34, obtainAndWriteInterfaceToken());
                NativeApiInfo nativeApiInfo = (NativeApiInfo) iax.a(transactAndReadException, NativeApiInfo.CREATOR);
                transactAndReadException.recycle();
                return nativeApiInfo;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public int[] getPendingExperimentIds() {
                Parcel transactAndReadException = transactAndReadException(32, obtainAndWriteInterfaceToken());
                int[] createIntArray = transactAndReadException.createIntArray();
                transactAndReadException.recycle();
                return createIntArray;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public PhraseAffinityResponse getPhraseAffinity(String[] strArr, PhraseAffinitySpecification phraseAffinitySpecification) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                iax.d(obtainAndWriteInterfaceToken, phraseAffinitySpecification);
                Parcel transactAndReadException = transactAndReadException(24, obtainAndWriteInterfaceToken);
                PhraseAffinityResponse phraseAffinityResponse = (PhraseAffinityResponse) iax.a(transactAndReadException, PhraseAffinityResponse.CREATOR);
                transactAndReadException.recycle();
                return phraseAffinityResponse;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public StorageStats getStorageStatistics() {
                Parcel transactAndReadException = transactAndReadException(28, obtainAndWriteInterfaceToken());
                StorageStats storageStats = (StorageStats) iax.a(transactAndReadException, StorageStats.CREATOR);
                transactAndReadException.recycle();
                return storageStats;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public GlobalSearchApplicationInfo[] getUniversalSearchableApps() {
                Parcel transactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken());
                GlobalSearchApplicationInfo[] globalSearchApplicationInfoArr = (GlobalSearchApplicationInfo[]) transactAndReadException.createTypedArray(GlobalSearchApplicationInfo.CREATOR);
                transactAndReadException.recycle();
                return globalSearchApplicationInfoArr;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public SearchResults query(String str, String str2, String[] strArr, int i, int i2, QuerySpecification querySpecification) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                iax.d(obtainAndWriteInterfaceToken, querySpecification);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                SearchResults searchResults = (SearchResults) iax.a(transactAndReadException, SearchResults.CREATOR);
                transactAndReadException.recycle();
                return searchResults;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public SearchResults queryUniversal(String str, int i, int i2, GlobalSearchQuerySpecification globalSearchQuerySpecification) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                iax.d(obtainAndWriteInterfaceToken, globalSearchQuerySpecification);
                Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken);
                SearchResults searchResults = (SearchResults) iax.a(transactAndReadException, SearchResults.CREATOR);
                transactAndReadException.recycle();
                return searchResults;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public void registerCorpusInfo(String str, RegisterCorpusInfo registerCorpusInfo) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, registerCorpusInfo);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public boolean registerCorpusInfo2(String str, RegisterCorpusInfo registerCorpusInfo) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, registerCorpusInfo);
                Parcel transactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public boolean registerIME(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(20, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public void registerUniversalSearchableApp(GlobalSearchApplicationInfo globalSearchApplicationInfo) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, globalSearchApplicationInfo);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public boolean reportResultClick(ResultClickInfo resultClickInfo) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, resultClickInfo);
                Parcel transactAndReadException = transactAndReadException(19, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public boolean requestIndexing(String str, String str2, long j, RequestIndexingSpecification requestIndexingSpecification) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeLong(j);
                iax.d(obtainAndWriteInterfaceToken, requestIndexingSpecification);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public boolean setExperimentIds(byte[] bArr, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                Parcel transactAndReadException = transactAndReadException(30, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public void setIncludeInGlobalSearch(String str, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(36, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public SuggestionResults suggest(String str, String str2, String[] strArr, int i, SuggestSpecification suggestSpecification) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.d(obtainAndWriteInterfaceToken, suggestSpecification);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                SuggestionResults suggestionResults = (SuggestionResults) iax.a(transactAndReadException, SuggestionResults.CREATOR);
                transactAndReadException.recycle();
                return suggestionResults;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public void triggerCompaction() {
                transactAndReadExceptionReturnVoid(18, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public void unblockPackages(String[] strArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                transactAndReadExceptionReturnVoid(17, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public Bundle unregister(String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) iax.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public void unregisterIME(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(21, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public void unregisterUniversalSearchableApp(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.appdatasearch.internal.IAppDataSearch");
        }

        public static IAppDataSearch asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.IAppDataSearch");
            if (queryLocalInterface instanceof IAppDataSearch) {
                return (IAppDataSearch) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0001. Please report as an issue. */
        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String[] createStringArray = parcel.createStringArray();
                    int readInt = parcel.readInt();
                    int readInt2 = parcel.readInt();
                    QuerySpecification querySpecification = (QuerySpecification) iax.a(parcel, QuerySpecification.CREATOR);
                    enforceNoDataAvail(parcel);
                    SearchResults query = query(readString, readString2, createStringArray, readInt, readInt2, querySpecification);
                    parcel2.writeNoException();
                    iax.e(parcel2, query);
                    return true;
                case 2:
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    String[] createStringArray2 = parcel.createStringArray();
                    int readInt3 = parcel.readInt();
                    SuggestSpecification suggestSpecification = (SuggestSpecification) iax.a(parcel, SuggestSpecification.CREATOR);
                    enforceNoDataAvail(parcel);
                    SuggestionResults suggest = suggest(readString3, readString4, createStringArray2, readInt3, suggestSpecification);
                    parcel2.writeNoException();
                    iax.e(parcel2, suggest);
                    return true;
                case 3:
                    String[] createStringArray3 = parcel.createStringArray();
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    QuerySpecification querySpecification2 = (QuerySpecification) iax.a(parcel, QuerySpecification.CREATOR);
                    enforceNoDataAvail(parcel);
                    DocumentResults documents = getDocuments(createStringArray3, readString5, readString6, querySpecification2);
                    parcel2.writeNoException();
                    iax.e(parcel2, documents);
                    return true;
                case 4:
                    String readString7 = parcel.readString();
                    String readString8 = parcel.readString();
                    long readLong = parcel.readLong();
                    RequestIndexingSpecification requestIndexingSpecification = (RequestIndexingSpecification) iax.a(parcel, RequestIndexingSpecification.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean requestIndexing = requestIndexing(readString7, readString8, readLong, requestIndexingSpecification);
                    parcel2.writeNoException();
                    parcel2.writeInt(requestIndexing ? 1 : 0);
                    return true;
                case 5:
                    String readString9 = parcel.readString();
                    String readString10 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    CorpusStatus corpusStatus = getCorpusStatus(readString9, readString10);
                    parcel2.writeNoException();
                    iax.e(parcel2, corpusStatus);
                    return true;
                case 6:
                    String readString11 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    String[] corpusNames = getCorpusNames(readString11);
                    parcel2.writeNoException();
                    parcel2.writeStringArray(corpusNames);
                    return true;
                case 7:
                    String readString12 = parcel.readString();
                    RegisterCorpusInfo registerCorpusInfo = (RegisterCorpusInfo) iax.a(parcel, RegisterCorpusInfo.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerCorpusInfo(readString12, registerCorpusInfo);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    Bundle unregister = unregister(readString13, readString14);
                    parcel2.writeNoException();
                    iax.e(parcel2, unregister);
                    return true;
                case 9:
                    Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    Bundle diagnostic = diagnostic(bundle);
                    parcel2.writeNoException();
                    iax.e(parcel2, diagnostic);
                    return true;
                case 10:
                    String readString15 = parcel.readString();
                    int readInt4 = parcel.readInt();
                    int readInt5 = parcel.readInt();
                    GlobalSearchQuerySpecification globalSearchQuerySpecification = (GlobalSearchQuerySpecification) iax.a(parcel, GlobalSearchQuerySpecification.CREATOR);
                    enforceNoDataAvail(parcel);
                    SearchResults queryUniversal = queryUniversal(readString15, readInt4, readInt5, globalSearchQuerySpecification);
                    parcel2.writeNoException();
                    iax.e(parcel2, queryUniversal);
                    return true;
                case 11:
                    GlobalSearchApplicationInfo globalSearchApplicationInfo = (GlobalSearchApplicationInfo) iax.a(parcel, GlobalSearchApplicationInfo.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerUniversalSearchableApp(globalSearchApplicationInfo);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    String readString16 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    unregisterUniversalSearchableApp(readString16);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    GlobalSearchApplicationInfo[] universalSearchableApps = getUniversalSearchableApps();
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(universalSearchableApps, 1);
                    return true;
                case 14:
                    String readString17 = parcel.readString();
                    RegisterCorpusInfo registerCorpusInfo2 = (RegisterCorpusInfo) iax.a(parcel, RegisterCorpusInfo.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean registerCorpusInfo22 = registerCorpusInfo2(readString17, registerCorpusInfo2);
                    parcel2.writeNoException();
                    parcel2.writeInt(registerCorpusInfo22 ? 1 : 0);
                    return true;
                case 15:
                case 26:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                default:
                    return false;
                case 16:
                    String[] createStringArray4 = parcel.createStringArray();
                    enforceNoDataAvail(parcel);
                    blockPackages(createStringArray4);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    String[] createStringArray5 = parcel.createStringArray();
                    enforceNoDataAvail(parcel);
                    unblockPackages(createStringArray5);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    triggerCompaction();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    ResultClickInfo resultClickInfo = (ResultClickInfo) iax.a(parcel, ResultClickInfo.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean reportResultClick = reportResultClick(resultClickInfo);
                    parcel2.writeNoException();
                    parcel2.writeInt(reportResultClick ? 1 : 0);
                    return true;
                case 20:
                    String readString18 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    boolean registerIME = registerIME(readString18);
                    parcel2.writeNoException();
                    int i3 = iax.a;
                    parcel2.writeInt(registerIME ? 1 : 0);
                    return true;
                case 21:
                    String readString19 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    unregisterIME(readString19);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    String readString20 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    String[] corpusHandlesRegisteredForIME = getCorpusHandlesRegisteredForIME(readString20);
                    parcel2.writeNoException();
                    parcel2.writeStringArray(corpusHandlesRegisteredForIME);
                    return true;
                case 23:
                    String readString21 = parcel.readString();
                    int readInt6 = parcel.readInt();
                    byte[] createByteArray = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    PIMEUpdateResponse iMEUpdates = getIMEUpdates(readString21, readInt6, createByteArray);
                    parcel2.writeNoException();
                    iax.e(parcel2, iMEUpdates);
                    return true;
                case 24:
                    String[] createStringArray6 = parcel.createStringArray();
                    PhraseAffinitySpecification phraseAffinitySpecification = (PhraseAffinitySpecification) iax.a(parcel, PhraseAffinitySpecification.CREATOR);
                    enforceNoDataAvail(parcel);
                    PhraseAffinityResponse phraseAffinity = getPhraseAffinity(createStringArray6, phraseAffinitySpecification);
                    parcel2.writeNoException();
                    iax.e(parcel2, phraseAffinity);
                    return true;
                case 25:
                    String readString22 = parcel.readString();
                    String readString23 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    RegisterCorpusInfo corpusInfo = getCorpusInfo(readString22, readString23);
                    parcel2.writeNoException();
                    iax.e(parcel2, corpusInfo);
                    return true;
                case 27:
                    String readString24 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    String[] allCorpusNames = getAllCorpusNames(readString24);
                    parcel2.writeNoException();
                    parcel2.writeStringArray(allCorpusNames);
                    return true;
                case 28:
                    StorageStats storageStatistics = getStorageStatistics();
                    parcel2.writeNoException();
                    iax.e(parcel2, storageStatistics);
                    return true;
                case 29:
                    GlobalSearchApplication[] globalSearchApps = getGlobalSearchApps();
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(globalSearchApps, 1);
                    return true;
                case 30:
                    byte[] createByteArray2 = parcel.createByteArray();
                    boolean g = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    boolean experimentIds = setExperimentIds(createByteArray2, g);
                    parcel2.writeNoException();
                    parcel2.writeInt(experimentIds ? 1 : 0);
                    return true;
                case 31:
                    int[] currentExperimentIds = getCurrentExperimentIds();
                    parcel2.writeNoException();
                    parcel2.writeIntArray(currentExperimentIds);
                    return true;
                case 32:
                    int[] pendingExperimentIds = getPendingExperimentIds();
                    parcel2.writeNoException();
                    parcel2.writeIntArray(pendingExperimentIds);
                    return true;
                case 33:
                    boolean clearUsageReportData = clearUsageReportData();
                    parcel2.writeNoException();
                    int i4 = iax.a;
                    parcel2.writeInt(clearUsageReportData ? 1 : 0);
                    return true;
                case 34:
                    NativeApiInfo nativeApiInfo = getNativeApiInfo();
                    parcel2.writeNoException();
                    iax.e(parcel2, nativeApiInfo);
                    return true;
                case 36:
                    String readString25 = parcel.readString();
                    boolean g2 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setIncludeInGlobalSearch(readString25, g2);
                    parcel2.writeNoException();
                    return true;
            }
        }
    }

    void blockPackages(String[] strArr);

    boolean clearUsageReportData();

    Bundle diagnostic(Bundle bundle);

    String[] getAllCorpusNames(String str);

    String[] getCorpusHandlesRegisteredForIME(String str);

    RegisterCorpusInfo getCorpusInfo(String str, String str2);

    String[] getCorpusNames(String str);

    CorpusStatus getCorpusStatus(String str, String str2);

    int[] getCurrentExperimentIds();

    DocumentResults getDocuments(String[] strArr, String str, String str2, QuerySpecification querySpecification);

    GlobalSearchApplication[] getGlobalSearchApps();

    PIMEUpdateResponse getIMEUpdates(String str, int i, byte[] bArr);

    NativeApiInfo getNativeApiInfo();

    int[] getPendingExperimentIds();

    PhraseAffinityResponse getPhraseAffinity(String[] strArr, PhraseAffinitySpecification phraseAffinitySpecification);

    StorageStats getStorageStatistics();

    GlobalSearchApplicationInfo[] getUniversalSearchableApps();

    SearchResults query(String str, String str2, String[] strArr, int i, int i2, QuerySpecification querySpecification);

    SearchResults queryUniversal(String str, int i, int i2, GlobalSearchQuerySpecification globalSearchQuerySpecification);

    void registerCorpusInfo(String str, RegisterCorpusInfo registerCorpusInfo);

    boolean registerCorpusInfo2(String str, RegisterCorpusInfo registerCorpusInfo);

    boolean registerIME(String str);

    void registerUniversalSearchableApp(GlobalSearchApplicationInfo globalSearchApplicationInfo);

    boolean reportResultClick(ResultClickInfo resultClickInfo);

    boolean requestIndexing(String str, String str2, long j, RequestIndexingSpecification requestIndexingSpecification);

    boolean setExperimentIds(byte[] bArr, boolean z);

    void setIncludeInGlobalSearch(String str, boolean z);

    SuggestionResults suggest(String str, String str2, String[] strArr, int i, SuggestSpecification suggestSpecification);

    void triggerCompaction();

    void unblockPackages(String[] strArr);

    Bundle unregister(String str, String str2);

    void unregisterIME(String str);

    void unregisterUniversalSearchableApp(String str);
}
