package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abxj;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ErrorReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ErrorReport> CREATOR = new abxj(6);
    public String A;
    public String B;
    public String C;
    public Bundle D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public String I;
    public String J;
    public int K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;

    @Deprecated
    public String Q;
    public String R;
    public BitmapTeleporter S;
    public String T;
    public FileTeleporter[] U;
    public String[] V;
    public boolean W;
    public String X;
    public ThemeSettings Y;
    public LogOptions Z;
    public ApplicationErrorReport a;

    @Deprecated
    public String aa;
    public boolean ab;
    public Bundle ac;
    public List ad;
    public boolean ae;
    public Bitmap af;
    public String ag;
    public List ah;
    public int ai;
    public int aj;
    public String[] ak;
    public String[] al;
    public String[] am;
    public boolean an;
    public boolean ao;
    public String ap;
    public AdditionalConsentConfig aq;
    public ServiceDump[] ar;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public int k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String[] q;
    public String[] r;
    public String[] s;
    public String t;
    public String u;
    public byte[] v;
    public int w;
    public int x;
    public int y;
    public int z;

    public ErrorReport() {
        this.a = new ApplicationErrorReport();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, this.a, i, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.m(parcel, 4, this.c);
        abhi.q(parcel, 5, this.d, false);
        abhi.q(parcel, 6, this.e, false);
        abhi.q(parcel, 7, this.f, false);
        abhi.q(parcel, 8, this.g, false);
        abhi.q(parcel, 9, this.h, false);
        abhi.q(parcel, 10, this.i, false);
        abhi.q(parcel, 11, this.j, false);
        abhi.m(parcel, 12, this.k);
        abhi.q(parcel, 13, this.l, false);
        abhi.q(parcel, 14, this.m, false);
        abhi.q(parcel, 15, this.n, false);
        abhi.q(parcel, 16, this.o, false);
        abhi.q(parcel, 17, this.p, false);
        abhi.F(parcel, 18, this.q);
        abhi.F(parcel, 19, this.r);
        abhi.F(parcel, 20, this.s);
        abhi.q(parcel, 21, this.t, false);
        abhi.q(parcel, 22, this.u, false);
        abhi.j(parcel, 23, this.v, false);
        abhi.m(parcel, 24, this.w);
        abhi.m(parcel, 25, this.x);
        abhi.m(parcel, 26, this.y);
        abhi.m(parcel, 27, this.z);
        abhi.q(parcel, 28, this.A, false);
        abhi.q(parcel, 29, this.B, false);
        abhi.q(parcel, 30, this.C, false);
        abhi.t(parcel, 31, this.D);
        abhi.h(parcel, 32, this.E);
        abhi.m(parcel, 33, this.F);
        abhi.m(parcel, 34, this.G);
        abhi.h(parcel, 35, this.H);
        abhi.q(parcel, 36, this.I, false);
        abhi.q(parcel, 37, this.J, false);
        abhi.m(parcel, 38, this.K);
        abhi.q(parcel, 39, this.L, false);
        abhi.q(parcel, 40, this.M, false);
        abhi.q(parcel, 41, this.N, false);
        abhi.q(parcel, 42, this.O, false);
        abhi.q(parcel, 43, this.P, false);
        abhi.q(parcel, 44, this.Q, false);
        abhi.q(parcel, 45, this.R, false);
        abhi.o(parcel, 46, this.S, i, false);
        abhi.q(parcel, 47, this.T, false);
        abhi.H(parcel, 48, this.U, i);
        abhi.F(parcel, 49, this.V);
        abhi.h(parcel, 50, this.W);
        abhi.q(parcel, 51, this.X, false);
        abhi.o(parcel, 52, this.Y, i, false);
        abhi.o(parcel, 53, this.Z, i, false);
        abhi.q(parcel, 54, this.aa, false);
        abhi.h(parcel, 55, this.ab);
        abhi.t(parcel, 56, this.ac);
        abhi.r(parcel, 57, this.ad, false);
        abhi.h(parcel, 58, this.ae);
        abhi.o(parcel, 59, this.af, i, false);
        abhi.q(parcel, 60, this.ag, false);
        abhi.G(parcel, 61, this.ah);
        abhi.m(parcel, 62, this.ai);
        abhi.m(parcel, 63, this.aj);
        abhi.F(parcel, 64, this.ak);
        abhi.F(parcel, 65, this.al);
        abhi.F(parcel, 66, this.am);
        abhi.h(parcel, 67, this.an);
        abhi.h(parcel, 68, this.ao);
        abhi.q(parcel, 69, this.ap, false);
        abhi.o(parcel, 70, this.aq, i, false);
        abhi.H(parcel, 71, this.ar, i);
        abhi.g(parcel, e);
    }

    public ErrorReport(ApplicationErrorReport applicationErrorReport, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, String str12, String str13, String[] strArr, String[] strArr2, String[] strArr3, String str14, String str15, byte[] bArr, int i3, int i4, int i5, int i6, String str16, String str17, String str18, Bundle bundle, boolean z, int i7, int i8, boolean z2, String str19, String str20, int i9, String str21, String str22, String str23, String str24, String str25, String str26, String str27, BitmapTeleporter bitmapTeleporter, String str28, FileTeleporter[] fileTeleporterArr, String[] strArr4, boolean z3, String str29, ThemeSettings themeSettings, LogOptions logOptions, String str30, boolean z4, Bundle bundle2, List list, boolean z5, Bitmap bitmap, String str31, List list2, int i10, int i11, String[] strArr5, String[] strArr6, String[] strArr7, boolean z6, boolean z7, String str32, AdditionalConsentConfig additionalConsentConfig, ServiceDump[] serviceDumpArr) {
        new ApplicationErrorReport();
        this.a = applicationErrorReport;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = i2;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.o = str12;
        this.p = str13;
        this.q = strArr;
        this.r = strArr2;
        this.s = strArr3;
        this.t = str14;
        this.u = str15;
        this.v = bArr;
        this.w = i3;
        this.x = i4;
        this.y = i5;
        this.z = i6;
        this.A = str16;
        this.B = str17;
        this.C = str18;
        this.D = bundle;
        this.E = z;
        this.F = i7;
        this.G = i8;
        this.H = z2;
        this.I = str19;
        this.J = str20;
        this.K = i9;
        this.L = str21;
        this.M = str22;
        this.N = str23;
        this.O = str24;
        this.P = str25;
        this.Q = str26;
        this.R = str27;
        this.S = bitmapTeleporter;
        this.T = str28;
        this.U = fileTeleporterArr;
        this.V = strArr4;
        this.W = z3;
        this.X = str29;
        this.Y = themeSettings;
        this.Z = logOptions;
        this.aa = str30;
        this.ab = z4;
        this.ac = bundle2;
        this.ad = list;
        this.ae = z5;
        this.af = bitmap;
        this.ag = str31;
        this.ah = list2;
        this.ai = i10;
        this.aj = i11;
        this.ak = strArr5;
        this.al = strArr6;
        this.am = strArr7;
        this.an = z6;
        this.ao = z7;
        this.ap = str32;
        this.aq = additionalConsentConfig;
        this.ar = serviceDumpArr;
    }

    public ErrorReport(FeedbackOptions feedbackOptions, File file) {
        this.a = new ApplicationErrorReport();
        Bundle bundle = feedbackOptions.b;
        if (bundle != null && !bundle.isEmpty()) {
            this.D = feedbackOptions.b;
        }
        if (!TextUtils.isEmpty(feedbackOptions.a)) {
            this.B = feedbackOptions.a;
        }
        if (!TextUtils.isEmpty(feedbackOptions.c)) {
            this.b = feedbackOptions.c;
        }
        ApplicationErrorReport.CrashInfo crashInfo = feedbackOptions.d.crashInfo;
        if (crashInfo != null) {
            this.M = crashInfo.throwMethodName;
            this.K = crashInfo.throwLineNumber;
            this.L = crashInfo.throwClassName;
            this.N = crashInfo.stackTrace;
            this.I = crashInfo.exceptionClassName;
            this.O = crashInfo.exceptionMessage;
            this.J = crashInfo.throwFileName;
        }
        ThemeSettings themeSettings = feedbackOptions.j;
        if (themeSettings != null) {
            this.Y = themeSettings;
        }
        if (!TextUtils.isEmpty(feedbackOptions.e)) {
            this.P = feedbackOptions.e;
        }
        String str = feedbackOptions.g;
        if (!TextUtils.isEmpty(str)) {
            this.a.packageName = str;
        }
        if (!TextUtils.isEmpty(feedbackOptions.n)) {
            this.ag = feedbackOptions.n;
        }
        Bitmap bitmap = feedbackOptions.m;
        if (bitmap != null) {
            this.af = bitmap;
        }
        if (file != null) {
            this.S = feedbackOptions.f;
            List list = feedbackOptions.h;
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((FileTeleporter) it.next()).e = file;
                }
                this.U = (FileTeleporter[]) list.toArray(new FileTeleporter[0]);
            }
        }
        LogOptions logOptions = feedbackOptions.k;
        if (logOptions != null) {
            this.Z = logOptions;
        }
        this.W = feedbackOptions.i;
        this.ae = feedbackOptions.l;
        this.E = feedbackOptions.o;
        this.an = feedbackOptions.q;
        this.ap = feedbackOptions.r;
        this.aq = feedbackOptions.s;
    }
}
