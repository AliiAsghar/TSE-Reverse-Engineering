package com.google.android.apps.messaging.ui.mediapicker.c2o.content;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.afcp;
import defpackage.afcq;
import defpackage.ameb;
import defpackage.imr;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class MediaContentItem implements Parcelable, afcq {
    public final Uri b;
    public final String c;
    public final ameb d;

    /* JADX INFO: Access modifiers changed from: protected */
    public MediaContentItem(Uri uri, String str, ameb amebVar) {
        this.b = uri;
        this.c = str;
        this.d = amebVar == null ? ameb.UNKNOWN : amebVar;
    }

    public int d() {
        return -1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MediaContentItem)) {
            return false;
        }
        MediaContentItem mediaContentItem = (MediaContentItem) obj;
        if (mediaContentItem.h() == null || mediaContentItem.i() == null || !mediaContentItem.h().equals(h()) || !mediaContentItem.i().equals(i())) {
            return false;
        }
        return true;
    }

    public int f() {
        return -1;
    }

    @Override // defpackage.afcq
    public final afcp fh() {
        return imr.a(this.d);
    }

    @Override // defpackage.afcq
    public final /* synthetic */ String fj() {
        return toString();
    }

    public long g() {
        return -1L;
    }

    public Uri h() {
        return this.b;
    }

    public int hashCode() {
        return Objects.hash(h(), i());
    }

    public String i() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeInt(this.d.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MediaContentItem(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r3.readParcelable(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.String r1 = r3.readString()
            r1.getClass()
            int r3 = r3.readInt()
            ameb r3 = defpackage.ameb.b(r3)
            r2.<init>(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem.<init>(android.os.Parcel):void");
    }

    @Override // defpackage.afcs
    public final /* synthetic */ Object fi() {
        return this;
    }
}
