package com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.VisualContentItem;
import defpackage.aapv;
import defpackage.ameb;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ExpressiveStickerContentItem extends VisualContentItem {
    public static final Parcelable.Creator<ExpressiveStickerContentItem> CREATOR = new aapv(3);
    public final String a;

    public ExpressiveStickerContentItem(Uri uri, String str, int i, int i2, String str2, ameb amebVar) {
        super(uri, str, (amebVar == ameb.STICKER_CHOOSER || amebVar == (r0 = ameb.EXPRESSIVE_STICKER_CHOOSER) || amebVar == ameb.EXPRESSIVE_STICKER_PACK_DETAILS || amebVar == ameb.EXPRESSIVE_STICKER_GALLERY_SEARCH) ? amebVar : r0, i, i2);
        ameb amebVar2;
        this.a = str2;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpressiveStickerContentItem)) {
            return false;
        }
        return Objects.equals(this.a, ((ExpressiveStickerContentItem) obj).a);
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem
    public final Uri h() {
        return this.b;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem
    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem
    public final String i() {
        return this.c;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.VisualContentItem, com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
    }

    public ExpressiveStickerContentItem(Parcel parcel) {
        super(parcel);
        String readString = parcel.readString();
        readString.getClass();
        this.a = readString;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ExpressiveStickerContentItem(defpackage.tfh r8) {
        /*
            r7 = this;
            android.net.Uri r1 = r8.h()
            r0 = 2
            java.lang.String r2 = "content_type"
            r8.ao(r0, r2)
            java.lang.String r2 = r8.c
            r0 = 3
            java.lang.String r3 = "width"
            r8.ao(r0, r3)
            int r3 = r8.d
            r0 = 4
            java.lang.String r4 = "height"
            r8.ao(r0, r4)
            int r4 = r8.e
            java.lang.String r5 = r8.k()
            ameb r6 = defpackage.ameb.EXPRESSIVE_STICKER_CHOOSER
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker.ExpressiveStickerContentItem.<init>(tfh):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ExpressiveStickerContentItem(defpackage.aouy r9, defpackage.ameb r10) {
        /*
            r8 = this;
            aour r0 = r9.d
            if (r0 != 0) goto L6
            aour r0 = defpackage.aour.a
        L6:
            java.lang.String r0 = r0.b
            android.net.Uri r2 = android.net.Uri.parse(r0)
            aour r0 = r9.d
            if (r0 != 0) goto L12
            aour r0 = defpackage.aour.a
        L12:
            java.lang.String r3 = defpackage.ubh.a(r0)
            aour r0 = r9.d
            if (r0 != 0) goto L1c
            aour r0 = defpackage.aour.a
        L1c:
            aouq r0 = r0.d
            if (r0 != 0) goto L22
            aouq r0 = defpackage.aouq.a
        L22:
            int r4 = r0.b
            aour r0 = r9.d
            if (r0 != 0) goto L2a
            aour r0 = defpackage.aour.a
        L2a:
            aouq r0 = r0.d
            if (r0 != 0) goto L30
            aouq r0 = defpackage.aouq.a
        L30:
            int r5 = r0.c
            java.lang.String r6 = r9.b
            r1 = r8
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker.ExpressiveStickerContentItem.<init>(aouy, ameb):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ExpressiveStickerContentItem(defpackage.aouy r9, defpackage.aodc r10) {
        /*
            r8 = this;
            aour r0 = r9.d
            if (r0 != 0) goto L6
            aour r0 = defpackage.aour.a
        L6:
            java.lang.String r0 = r0.b
            android.net.Uri r2 = android.net.Uri.parse(r0)
            aour r0 = r9.d
            if (r0 != 0) goto L12
            aour r0 = defpackage.aour.a
        L12:
            java.lang.String r3 = defpackage.ubh.a(r0)
            aour r0 = r9.d
            if (r0 != 0) goto L1c
            aour r0 = defpackage.aour.a
        L1c:
            aouq r0 = r0.d
            if (r0 != 0) goto L22
            aouq r0 = defpackage.aouq.a
        L22:
            int r4 = r0.b
            aour r0 = r9.d
            if (r0 != 0) goto L2a
            aour r0 = defpackage.aour.a
        L2a:
            aouq r0 = r0.d
            if (r0 != 0) goto L30
            aouq r0 = defpackage.aouq.a
        L30:
            int r5 = r0.c
            java.lang.String r6 = r9.b
            int r9 = r10.ordinal()
            r10 = 4
            if (r9 == r10) goto L45
            r10 = 12
            if (r9 == r10) goto L42
            ameb r9 = defpackage.ameb.EXPRESSIVE_STICKER_CHOOSER
            goto L47
        L42:
            ameb r9 = defpackage.ameb.EXPRESSIVE_STICKER_PACK_DETAILS
            goto L47
        L45:
            ameb r9 = defpackage.ameb.EXPRESSIVE_STICKER_GALLERY_SEARCH
        L47:
            r7 = r9
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker.ExpressiveStickerContentItem.<init>(aouy, aodc):void");
    }
}
