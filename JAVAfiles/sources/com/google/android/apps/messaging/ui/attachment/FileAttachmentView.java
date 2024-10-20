package com.google.android.apps.messaging.ui.attachment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import defpackage.aabr;
import defpackage.rry;
import defpackage.xun;
import defpackage.ytt;
import defpackage.zot;
import defpackage.zpt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FileAttachmentView extends zot implements xun {
    FileIcon a;
    boolean b;
    int c;
    int d;
    GradientDrawable e;
    MessagePartCoreData f;
    int g;
    public zpt h;
    private Uri i;

    public FileAttachmentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.layout.file_attachment_view);
    }

    private final boolean h(boolean z, boolean z2, int i) {
        int d = this.h.d();
        if (z2) {
            d = this.d;
        }
        boolean z3 = true;
        if (this.c == d && this.b == z && isSelected() == z2 && this.g == i) {
            z3 = false;
        }
        this.b = z;
        this.c = d;
        this.g = i;
        setSelected(z2);
        return z3;
    }

    public void a(float[] fArr) {
        if (this.e == null) {
            this.e = zpt.n(getContext());
        }
        this.e.setColor(zpt.c(getContext(), isSelected()));
        this.e.setCornerRadii(fArr);
        setBackground(this.e);
        aabr.aG(this, fArr);
    }

    final void b() {
        aabr.aI(this, this.f, new ytt(11));
        FileIcon fileIcon = this.a;
        boolean z = this.b;
        int i = this.c;
        boolean isSelected = isSelected();
        if (fileIcon.b == z && fileIcon.d == i && fileIcon.isSelected() == isSelected) {
            return;
        }
        fileIcon.b = z;
        fileIcon.d = i;
        fileIcon.setSelected(isSelected);
        fileIcon.a();
    }

    @Override // defpackage.xun
    public final void c() {
        this.f = null;
        this.i = null;
    }

    @Override // defpackage.xul
    public final void d(boolean z, rry rryVar, Drawable drawable, float[] fArr) {
        if (h(rryVar.au(), z, rryVar.c())) {
            b();
        }
        a(fArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    @Override // defpackage.xun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r6, boolean r7, int r8) {
        /*
            r5 = this;
            com.google.android.apps.messaging.ui.attachment.FileIcon r8 = r5.a
            java.lang.String r0 = r6.U()
            r8.c = r0
            if (r6 != 0) goto Lc
            r8 = 0
            goto L10
        Lc:
            android.net.Uri r8 = r6.t()
        L10:
            r5.f = r6
            boolean r6 = r6.bv()
            r0 = 0
            r1 = -1
            if (r6 == 0) goto L6d
            com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r6 = r5.f
            java.lang.String r6 = r6.U()
            int r2 = r6.hashCode()
            r3 = -1248334925(0xffffffffb597ebb3, float:-1.1318974E-6)
            r4 = 1
            if (r2 == r3) goto L3a
            r3 = 326991069(0x137d7cdd, float:3.1994652E-27)
            if (r2 == r3) goto L30
            goto L44
        L30:
            java.lang.String r2 = "text/x-vCalendar"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L44
            r6 = r4
            goto L45
        L3a:
            java.lang.String r2 = "application/pdf"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L44
            r6 = r0
            goto L45
        L44:
            r6 = r1
        L45:
            if (r6 == 0) goto L61
            if (r6 == r4) goto L55
            android.content.Context r6 = r5.getContext()
            r2 = 2132022555(0x7f14151b, float:1.9683533E38)
            java.lang.String r6 = r6.getString(r2)
            goto L78
        L55:
            android.content.Context r6 = r5.getContext()
            r2 = 2132017692(0x7f14021c, float:1.967367E38)
            java.lang.String r6 = r6.getString(r2)
            goto L78
        L61:
            android.content.Context r6 = r5.getContext()
            r2 = 2132020202(0x7f140bea, float:1.967876E38)
            java.lang.String r6 = r6.getString(r2)
            goto L78
        L6d:
            android.content.Context r6 = r5.getContext()
            r2 = 2132022607(0x7f14154f, float:1.9683638E38)
            java.lang.String r6 = r6.getString(r2)
        L78:
            r5.setContentDescription(r6)
            android.net.Uri r6 = r5.i
            java.lang.String r2 = ""
            if (r6 != 0) goto L83
            r6 = r2
            goto L87
        L83:
            java.lang.String r6 = r6.toString()
        L87:
            if (r8 != 0) goto L8a
            goto L8e
        L8a:
            java.lang.String r2 = r8.toString()
        L8e:
            boolean r7 = r5.h(r7, r0, r1)
            boolean r6 = android.text.TextUtils.equals(r6, r2)
            if (r6 != 0) goto L99
            goto L9b
        L99:
            if (r7 == 0) goto La0
        L9b:
            r5.i = r8
            r5.b()
        La0:
            r5.g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.attachment.FileAttachmentView.g(com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, boolean, int):void");
    }

    public FileAttachmentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), i, this);
        this.d = context.getColor(R.color.primary_color);
        this.a = (FileIcon) findViewById(R.id.file_icon);
    }
}
