package com.google.android.apps.messaging.shared.datamodel;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.text.TextUtils;
import defpackage.armf;
import defpackage.qxe;
import defpackage.qxw;
import defpackage.ris;
import defpackage.rit;
import defpackage.riu;
import defpackage.xyl;
import defpackage.xze;
import defpackage.yjf;
import defpackage.yjr;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class BugleChooserTargetService extends qxw implements ris {
    private static final xze e = xze.g("BugleServices", "BugleChooserTargetService");
    private static final long f = TimeUnit.SECONDS.toMillis(2);
    public armf a;
    public armf b;
    public armf c;
    public armf d;
    private List g;
    private final Object h = new Object();
    private boolean i = false;

    private final void d() {
        this.i = true;
        synchronized (this.h) {
            this.h.notifyAll();
        }
    }

    @Override // defpackage.ris
    public final void a() {
        e.l("onGetFrecencyConversationActionFailed.");
        this.g = null;
        d();
    }

    @Override // defpackage.ris
    public final void b(List list) {
        this.g = list;
        d();
    }

    @Override // android.service.chooser.ChooserTargetService
    public final List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        e.l("onGetChooserTargets called().");
        this.g = new ArrayList();
        boolean z = true;
        if (!TextUtils.equals("com.google.android.apps.messaging.ui.conversationlist.ShareIntentActivity", componentName.getClassName()) && !TextUtils.equals("com.google.android.apps.messaging.ui.conversationlist.VideoShareIntentActivity", componentName.getClassName()) && !TextUtils.equals("com.google.android.apps.messaging.ui.conversationlist.SharePdfIntentActivity", componentName.getClassName()) && !TextUtils.equals("com.google.android.apps.messaging.ui.conversationlist.ShareCalendarIntentActivity", componentName.getClassName()) && !TextUtils.equals("com.google.android.apps.messaging.ui.conversationlist.SharePhaseOneSupportedFileIntentActivity", componentName.getClassName())) {
            z = false;
        }
        xyl.k(z);
        ((qxe) this.c.b()).a = componentName;
        if (((yjf) this.a.b()).h() && ((yjr) this.b.b()).B()) {
            ((riu) this.d.b()).a().p(new rit(this, 0));
            while (!this.i) {
                synchronized (this.h) {
                    try {
                        try {
                            this.h.wait(f);
                        } catch (InterruptedException unused) {
                            return this.g;
                        }
                    } finally {
                    }
                }
            }
        }
        return this.g;
    }
}
