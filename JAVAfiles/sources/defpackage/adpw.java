package defpackage;

import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class adpw extends adou {
    public final CopyOnWriteArrayList g;
    public adqa h;

    public adpw(adew adewVar, adqg adqgVar, adqa adqaVar, adwe adweVar) {
        super(adewVar, adqgVar, adweVar);
        this.g = new CopyOnWriteArrayList();
        this.h = adqaVar;
    }

    public final void p(adpv adpvVar) {
        if (this.g.contains(adpvVar)) {
            advr.c("Listener is already registered!", new Object[0]);
        } else {
            this.g.add(adpvVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean r() {
        InstantMessageConfiguration d = this.a.d();
        advp advpVar = adwf.a;
        return d.a();
    }

    public abstract void s(String str, long j, String str2);

    public abstract void t(String str);

    public void q(aion aionVar) {
    }
}
