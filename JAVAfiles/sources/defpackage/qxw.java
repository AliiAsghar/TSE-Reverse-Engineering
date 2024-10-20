package defpackage;

import android.service.chooser.ChooserTargetService;
import com.google.android.apps.messaging.shared.datamodel.BugleChooserTargetService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class qxw extends ChooserTargetService implements apxr {
    private volatile apxl a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final apxl aR() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new apxl(this);
                }
            }
        }
        return this.a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            BugleChooserTargetService bugleChooserTargetService = (BugleChooserTargetService) this;
            krv krvVar = ((kqo) aS()).b;
            bugleChooserTargetService.a = krvVar.bU;
            bugleChooserTargetService.b = krvVar.bO;
            krx krxVar = krvVar.a;
            bugleChooserTargetService.c = krxVar.al;
            bugleChooserTargetService.d = krxVar.am;
        }
        super.onCreate();
    }
}
