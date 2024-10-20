package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.AdditionalConsentConfig;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abyo implements Parcelable.Creator {
    public static void a(FeedbackOptions feedbackOptions, Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, feedbackOptions.a, false);
        abhi.t(parcel, 3, feedbackOptions.b);
        abhi.q(parcel, 5, feedbackOptions.c, false);
        abhi.o(parcel, 6, feedbackOptions.d, i, false);
        abhi.q(parcel, 7, feedbackOptions.e, false);
        abhi.o(parcel, 8, feedbackOptions.f, i, false);
        abhi.q(parcel, 9, feedbackOptions.g, false);
        abhi.r(parcel, 10, feedbackOptions.h, false);
        abhi.h(parcel, 11, feedbackOptions.i);
        abhi.o(parcel, 12, feedbackOptions.j, i, false);
        abhi.o(parcel, 13, feedbackOptions.k, i, false);
        abhi.h(parcel, 14, feedbackOptions.l);
        abhi.o(parcel, 15, feedbackOptions.m, i, false);
        abhi.q(parcel, 16, feedbackOptions.n, false);
        abhi.h(parcel, 17, feedbackOptions.o);
        abhi.n(parcel, 18, feedbackOptions.p);
        abhi.h(parcel, 19, feedbackOptions.q);
        abhi.q(parcel, 20, feedbackOptions.r, false);
        abhi.o(parcel, 21, feedbackOptions.s, i, false);
        abhi.g(parcel, e);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int P = abhi.P(parcel);
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        ApplicationErrorReport applicationErrorReport = null;
        String str3 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str4 = null;
        ArrayList arrayList = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        Bitmap bitmap = null;
        String str5 = null;
        String str6 = null;
        AdditionalConsentConfig additionalConsentConfig = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        long j = 0;
        while (parcel.dataPosition() < P) {
            int readInt = parcel.readInt();
            switch (abhi.L(readInt)) {
                case 2:
                    str = abhi.ab(parcel, readInt);
                    break;
                case 3:
                    bundle = abhi.S(parcel, readInt);
                    break;
                case 4:
                default:
                    abhi.ak(parcel, readInt);
                    break;
                case 5:
                    str2 = abhi.ab(parcel, readInt);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) abhi.V(parcel, readInt, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    str3 = abhi.ab(parcel, readInt);
                    break;
                case 8:
                    bitmapTeleporter = (BitmapTeleporter) abhi.V(parcel, readInt, BitmapTeleporter.CREATOR);
                    break;
                case 9:
                    str4 = abhi.ab(parcel, readInt);
                    break;
                case 10:
                    arrayList = abhi.ah(parcel, readInt, FileTeleporter.CREATOR);
                    break;
                case 11:
                    z = abhi.al(parcel, readInt);
                    break;
                case 12:
                    themeSettings = (ThemeSettings) abhi.V(parcel, readInt, ThemeSettings.CREATOR);
                    break;
                case 13:
                    logOptions = (LogOptions) abhi.V(parcel, readInt, LogOptions.CREATOR);
                    break;
                case 14:
                    z2 = abhi.al(parcel, readInt);
                    break;
                case 15:
                    bitmap = (Bitmap) abhi.V(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 16:
                    str5 = abhi.ab(parcel, readInt);
                    break;
                case 17:
                    z3 = abhi.al(parcel, readInt);
                    break;
                case 18:
                    j = abhi.Q(parcel, readInt);
                    break;
                case 19:
                    z4 = abhi.al(parcel, readInt);
                    break;
                case 20:
                    str6 = abhi.ab(parcel, readInt);
                    break;
                case 21:
                    additionalConsentConfig = (AdditionalConsentConfig) abhi.V(parcel, readInt, AdditionalConsentConfig.CREATOR);
                    break;
            }
        }
        abhi.aj(parcel, P);
        return new FeedbackOptions(str, bundle, str2, applicationErrorReport, str3, bitmapTeleporter, str4, arrayList, z, themeSettings, logOptions, z2, bitmap, str5, z3, j, z4, str6, additionalConsentConfig);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FeedbackOptions[i];
    }
}
