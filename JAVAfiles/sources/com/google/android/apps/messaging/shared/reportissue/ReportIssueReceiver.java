package com.google.android.apps.messaging.shared.reportissue;

import defpackage.akrc;
import defpackage.aksr;
import defpackage.armf;
import defpackage.wom;
import defpackage.xze;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ReportIssueReceiver extends wom {
    public static final xze a = xze.g("Bugle", "ReportIssueReceiver");
    public armf b;
    public armf c;
    public armf d;
    public armf e;

    @Override // defpackage.wng
    public final akrc a() {
        return ((aksr) this.d.b()).b("ReportIssueReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.ReportIssue.Latency";
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e5, code lost:
    
        if (r10.isEmpty() != false) goto L50;
     */
    @Override // defpackage.wng
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.content.Context r10, android.content.Intent r11) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.reportissue.ReportIssueReceiver.c(android.content.Context, android.content.Intent):void");
    }

    @Override // defpackage.wng
    protected final int e() {
        return 18;
    }
}
