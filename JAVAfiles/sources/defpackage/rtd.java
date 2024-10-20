package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rtd {
    public final MessageIdType a;
    public final String b;
    public final String c;
    public final Uri d;
    public final Uri e;
    public final Uri f;
    public final int g;
    public final int h;
    public final long i;
    public final long j;
    public final ameb k;
    public final String l;
    public final String m;
    public final long n;
    public final LocationInformation o;
    public final String p;
    public final String q;
    public final String r;
    public final aggp s;
    public final long t;
    public final tqj u;
    public final int v;
    public final boolean w;
    public final boolean x;
    public final tqi y;
    public final tqq z;

    public rtd() {
        throw null;
    }

    public static rtc a() {
        rtc rtcVar = new rtc();
        rtcVar.a = rvc.a;
        rtcVar.m(-1);
        rtcVar.e(-1);
        rtcVar.c(-1L);
        rtcVar.l(-1L);
        rtcVar.d(-1L);
        rtcVar.f(-1L);
        rtcVar.k(ameb.UNKNOWN);
        rtcVar.b(0);
        rtcVar.g(tqj.STANDARD);
        rtcVar.i(tqq.NONE);
        rtcVar.n = tqi.DEFAULT_NO_VERDICT;
        return rtcVar;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        Uri uri;
        Uri uri2;
        Uri uri3;
        String str3;
        String str4;
        LocationInformation locationInformation;
        String str5;
        String str6;
        String str7;
        aggp aggpVar;
        tqi tqiVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof rtd) {
            rtd rtdVar = (rtd) obj;
            if (this.a.equals(rtdVar.a) && ((str = this.b) != null ? str.equals(rtdVar.b) : rtdVar.b == null) && ((str2 = this.c) != null ? str2.equals(rtdVar.c) : rtdVar.c == null) && ((uri = this.d) != null ? uri.equals(rtdVar.d) : rtdVar.d == null) && ((uri2 = this.e) != null ? uri2.equals(rtdVar.e) : rtdVar.e == null) && ((uri3 = this.f) != null ? uri3.equals(rtdVar.f) : rtdVar.f == null) && this.g == rtdVar.g && this.h == rtdVar.h && this.i == rtdVar.i && this.j == rtdVar.j && this.k.equals(rtdVar.k) && ((str3 = this.l) != null ? str3.equals(rtdVar.l) : rtdVar.l == null) && ((str4 = this.m) != null ? str4.equals(rtdVar.m) : rtdVar.m == null) && this.n == rtdVar.n && ((locationInformation = this.o) != null ? locationInformation.equals(rtdVar.o) : rtdVar.o == null) && ((str5 = this.p) != null ? str5.equals(rtdVar.p) : rtdVar.p == null) && ((str6 = this.q) != null ? str6.equals(rtdVar.q) : rtdVar.q == null) && ((str7 = this.r) != null ? str7.equals(rtdVar.r) : rtdVar.r == null) && ((aggpVar = this.s) != null ? aggpVar.equals(rtdVar.s) : rtdVar.s == null) && this.t == rtdVar.t && this.u.equals(rtdVar.u) && this.v == rtdVar.v && this.w == rtdVar.w && this.x == rtdVar.x && ((tqiVar = this.y) != null ? tqiVar.equals(rtdVar.y) : rtdVar.y == null) && this.z.equals(rtdVar.z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int i;
        int hashCode13 = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = ((hashCode13 * 1000003) ^ hashCode) * 1000003;
        String str2 = this.c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i4 = (i3 ^ hashCode2) * 1000003;
        Uri uri = this.d;
        if (uri == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = uri.hashCode();
        }
        int i5 = (i4 ^ hashCode3) * 1000003;
        Uri uri2 = this.e;
        if (uri2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = uri2.hashCode();
        }
        int i6 = (i5 ^ hashCode4) * 1000003;
        Uri uri3 = this.f;
        if (uri3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = uri3.hashCode();
        }
        int i7 = (((((i6 ^ hashCode5) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003;
        long j = this.i;
        long j2 = this.j;
        int hashCode14 = (((((i7 ^ ((int) (j ^ (j >>> 32)))) * (-721379959)) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.k.hashCode()) * 1000003;
        String str3 = this.l;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i8 = (hashCode14 ^ hashCode6) * 1000003;
        String str4 = this.m;
        if (str4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str4.hashCode();
        }
        int i9 = (i8 ^ hashCode7) * 1000003;
        long j3 = this.n;
        int i10 = (i9 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        LocationInformation locationInformation = this.o;
        if (locationInformation == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = locationInformation.hashCode();
        }
        int i11 = (i10 ^ hashCode8) * 1000003;
        String str5 = this.p;
        if (str5 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str5.hashCode();
        }
        int i12 = (i11 ^ hashCode9) * 1000003;
        String str6 = this.q;
        if (str6 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str6.hashCode();
        }
        int i13 = (i12 ^ hashCode10) * 1000003;
        String str7 = this.r;
        if (str7 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str7.hashCode();
        }
        int i14 = (i13 ^ hashCode11) * 1000003;
        aggp aggpVar = this.s;
        if (aggpVar == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = aggpVar.hashCode();
        }
        int i15 = (i14 ^ hashCode12) * 1000003;
        long j4 = this.t;
        int hashCode15 = (((((i15 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ this.u.hashCode()) * 1000003) ^ this.v) * 1000003;
        int i16 = 1237;
        if (true != this.w) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i17 = (hashCode15 ^ i) * 1000003;
        if (true == this.x) {
            i16 = 1231;
        }
        int i18 = (i17 ^ i16) * (-721379959);
        tqi tqiVar = this.y;
        if (tqiVar != null) {
            i2 = tqiVar.hashCode();
        }
        return ((i18 ^ i2) * 1000003) ^ this.z.hashCode();
    }

    public final String toString() {
        tqq tqqVar = this.z;
        tqi tqiVar = this.y;
        tqj tqjVar = this.u;
        aggp aggpVar = this.s;
        LocationInformation locationInformation = this.o;
        ameb amebVar = this.k;
        Uri uri = this.f;
        Uri uri2 = this.e;
        Uri uri3 = this.d;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(uri3);
        String valueOf3 = String.valueOf(uri2);
        String valueOf4 = String.valueOf(uri);
        String valueOf5 = String.valueOf(amebVar);
        String valueOf6 = String.valueOf(locationInformation);
        String valueOf7 = String.valueOf(aggpVar);
        String valueOf8 = String.valueOf(tqjVar);
        String valueOf9 = String.valueOf(tqiVar);
        String valueOf10 = String.valueOf(tqqVar);
        StringBuilder sb = new StringBuilder("MessagePartDataValues{messageId=");
        sb.append(valueOf);
        sb.append(", messageText=");
        sb.append(this.b);
        sb.append(", contentType=");
        sb.append(this.c);
        sb.append(", contentUri=");
        sb.append(valueOf2);
        sb.append(", originalUri=");
        sb.append(valueOf3);
        sb.append(", fallbackUri=");
        sb.append(valueOf4);
        sb.append(", width=");
        sb.append(this.g);
        sb.append(", height=");
        sb.append(this.h);
        sb.append(", duration=");
        sb.append(this.i);
        sb.append(", outputUri=null, targetFileSize=");
        sb.append(this.j);
        sb.append(", source=");
        sb.append(valueOf5);
        sb.append(", stickerSetId=");
        sb.append(this.l);
        sb.append(", stickerId=");
        sb.append(this.m);
        sb.append(", mediaModifiedTimestamp=");
        sb.append(this.n);
        sb.append(", locationInfo=");
        sb.append(valueOf6);
        sb.append(", expressiveStickerName=");
        sb.append(this.p);
        sb.append(", fileName=");
        sb.append(this.q);
        sb.append(", previewContentType=");
        sb.append(this.r);
        sb.append(", voiceMetadata=");
        sb.append(valueOf7);
        sb.append(", fileSizeBytes=");
        sb.append(this.t);
        sb.append(", mediaSendType=");
        sb.append(valueOf8);
        boolean z = this.x;
        boolean z2 = this.w;
        int i = this.v;
        sb.append(", bundleIndex=");
        sb.append(i);
        sb.append(", preserveSize=");
        sb.append(z2);
        sb.append(", saveToExternalStorage=");
        sb.append(z);
        sb.append(", processingId=null, imageDisplayState=");
        sb.append(valueOf9);
        sb.append(", richCardMediaDownloadFailureReason=");
        sb.append(valueOf10);
        sb.append("}");
        return sb.toString();
    }

    public rtd(MessageIdType messageIdType, String str, String str2, Uri uri, Uri uri2, Uri uri3, int i, int i2, long j, long j2, ameb amebVar, String str3, String str4, long j3, LocationInformation locationInformation, String str5, String str6, String str7, aggp aggpVar, long j4, tqj tqjVar, int i3, boolean z, boolean z2, tqi tqiVar, tqq tqqVar) {
        this.a = messageIdType;
        this.b = str;
        this.c = str2;
        this.d = uri;
        this.e = uri2;
        this.f = uri3;
        this.g = i;
        this.h = i2;
        this.i = j;
        this.j = j2;
        this.k = amebVar;
        this.l = str3;
        this.m = str4;
        this.n = j3;
        this.o = locationInformation;
        this.p = str5;
        this.q = str6;
        this.r = str7;
        this.s = aggpVar;
        this.t = j4;
        this.u = tqjVar;
        this.v = i3;
        this.w = z;
        this.x = z2;
        this.y = tqiVar;
        this.z = tqqVar;
    }
}
