package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.FRDProductSpecificDataEntry;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.android.gms.googlehelp.trails.TrailsInteraction;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acai implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int P = abhi.P(parcel);
        String str = null;
        Account account = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        Bitmap bitmap = null;
        ArrayList arrayList = null;
        Bundle bundle2 = null;
        Bitmap bitmap2 = null;
        byte[] bArr = null;
        String str4 = null;
        Uri uri = null;
        ArrayList arrayList2 = null;
        ThemeSettings themeSettings = null;
        ArrayList arrayList3 = null;
        ErrorReport errorReport = null;
        TogglingData togglingData = null;
        PendingIntent pendingIntent = null;
        String str5 = null;
        String str6 = null;
        ND4CSettings nD4CSettings = null;
        ArrayList arrayList4 = null;
        String str7 = null;
        ArrayList arrayList5 = null;
        String str8 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        int i8 = 0;
        int i9 = 0;
        while (parcel.dataPosition() < P) {
            int readInt = parcel.readInt();
            switch (abhi.L(readInt)) {
                case 1:
                    i = abhi.N(parcel, readInt);
                    break;
                case 2:
                    str = abhi.ab(parcel, readInt);
                    break;
                case 3:
                    account = (Account) abhi.V(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    bundle = abhi.S(parcel, readInt);
                    break;
                case 5:
                    z = abhi.al(parcel, readInt);
                    break;
                case 6:
                    z2 = abhi.al(parcel, readInt);
                    break;
                case 7:
                    arrayList = abhi.ag(parcel, readInt);
                    break;
                case 8:
                case 9:
                case 12:
                case 13:
                case 24:
                case 26:
                case 27:
                case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                case 30:
                default:
                    abhi.ak(parcel, readInt);
                    break;
                case 10:
                    bundle2 = abhi.S(parcel, readInt);
                    break;
                case 11:
                    bitmap2 = (Bitmap) abhi.V(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 14:
                    str4 = abhi.ab(parcel, readInt);
                    break;
                case 15:
                    uri = (Uri) abhi.V(parcel, readInt, Uri.CREATOR);
                    break;
                case 16:
                    arrayList2 = abhi.ah(parcel, readInt, OverflowMenuItem.CREATOR);
                    break;
                case 17:
                    i4 = abhi.N(parcel, readInt);
                    break;
                case 18:
                    arrayList3 = abhi.ah(parcel, readInt, OfflineSuggestion.CREATOR);
                    break;
                case 19:
                    bArr = abhi.am(parcel, readInt);
                    break;
                case 20:
                    i2 = abhi.N(parcel, readInt);
                    break;
                case 21:
                    i3 = abhi.N(parcel, readInt);
                    break;
                case 22:
                    z3 = abhi.al(parcel, readInt);
                    break;
                case 23:
                    errorReport = (ErrorReport) abhi.V(parcel, readInt, ErrorReport.CREATOR);
                    break;
                case 25:
                    themeSettings = (ThemeSettings) abhi.V(parcel, readInt, ThemeSettings.CREATOR);
                    break;
                case 28:
                    str2 = abhi.ab(parcel, readInt);
                    break;
                case 31:
                    togglingData = (TogglingData) abhi.V(parcel, readInt, TogglingData.CREATOR);
                    break;
                case 32:
                    i5 = abhi.N(parcel, readInt);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                    pendingIntent = (PendingIntent) abhi.V(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                    str3 = abhi.ab(parcel, readInt);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                    bitmap = (Bitmap) abhi.V(parcel, readInt, Bitmap.CREATOR);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                    i6 = abhi.N(parcel, readInt);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                    z4 = abhi.al(parcel, readInt);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                    z5 = abhi.al(parcel, readInt);
                    break;
                case 39:
                    i7 = abhi.N(parcel, readInt);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                    str5 = abhi.ab(parcel, readInt);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                    z6 = abhi.al(parcel, readInt);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                    str6 = abhi.ab(parcel, readInt);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                    z7 = abhi.al(parcel, readInt);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                    nD4CSettings = (ND4CSettings) abhi.V(parcel, readInt, ND4CSettings.CREATOR);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                    z8 = abhi.al(parcel, readInt);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                    arrayList4 = abhi.ah(parcel, readInt, FRDProductSpecificDataEntry.CREATOR);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                    str7 = abhi.ab(parcel, readInt);
                    break;
                case 48:
                    i8 = abhi.N(parcel, readInt);
                    break;
                case 49:
                    i9 = abhi.N(parcel, readInt);
                    break;
                case 50:
                    arrayList5 = abhi.ah(parcel, readInt, TrailsInteraction.CREATOR);
                    break;
                case 51:
                    str8 = abhi.ab(parcel, readInt);
                    break;
            }
        }
        abhi.aj(parcel, P);
        return new GoogleHelp(i, str, account, bundle, str2, str3, bitmap, z, z2, arrayList, bundle2, bitmap2, bArr, i2, i3, str4, uri, arrayList2, i4, themeSettings, arrayList3, z3, errorReport, togglingData, i5, pendingIntent, i6, z4, z5, i7, str5, z6, str6, z7, nD4CSettings, z8, arrayList4, str7, i8, i9, arrayList5, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleHelp[i];
    }
}
