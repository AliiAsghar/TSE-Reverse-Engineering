package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ily {
    public static final alwo a = alwo.o("BugleDraft");
    public final armf b;
    public final rsr c;
    public ikl d;
    public rsa e;
    public boolean f;
    public boolean g;
    public boolean h;
    public ammc i;
    private final armf j;
    private final psw k;
    private final msk l;
    private final ryg m;

    public ily(rsr rsrVar, armf armfVar, armf armfVar2, psw pswVar, ryg rygVar, msk mskVar) {
        this.c = rsrVar;
        this.b = armfVar;
        this.j = armfVar2;
        this.k = pswVar;
        this.m = rygVar;
        this.l = mskVar;
    }

    public final void a() {
        Optional n;
        boolean z;
        ikl iklVar = this.d;
        if (iklVar != null) {
            this.c.K(iklVar, this.i);
            ikl iklVar2 = this.d;
            if (iklVar2 != null) {
                boolean z2 = true;
                if (!iklVar2.d() && !b()) {
                    rsa rsaVar = this.e;
                    if (rsaVar == null) {
                        if (((Boolean) ((utz) jbh.a.get()).e()).booleanValue()) {
                            ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorRcsController", "updateRcsDraftSupported", BasePaymentResult.ERROR_REQUEST_TIMEOUT, "DraftEditorRcsController.java")).q("DraftEditorRcsController#updateRcsDraftSupported=false because conversation participants are not loaded");
                            return;
                        }
                        return;
                    }
                    ParticipantsTable.BindData a2 = rsaVar.a();
                    if (a2 != null && !vcp.k(a2)) {
                        if (this.k.a()) {
                            n = Optional.of(this.m.n(this.l.q(a2)));
                        } else {
                            n = ((vqu) this.j.b()).n(a2);
                        }
                        if (n.isPresent() && ((psv) n.get()).i()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean f = ((nct) this.b.b()).f(this.c.y());
                        if (!this.c.ah(z) || f) {
                            z2 = false;
                        }
                        this.g = z2;
                        alwo alwoVar = a;
                        ((alwl) alwoVar.m().h("com/google/android/apps/messaging/conversation/draft/DraftEditorRcsController", "updateRcsDraftSupported", 241, "DraftEditorRcsController.java")).t("isRcsDisabledForPreUpRecipient: %s", Boolean.valueOf(f));
                        ((alwl) alwoVar.m().h("com/google/android/apps/messaging/conversation/draft/DraftEditorRcsController", "updateRcsDraftSupported", 242, "DraftEditorRcsController.java")).t("isRcsDraftSupported: %s", Boolean.valueOf(this.g));
                        return;
                    }
                    if (((Boolean) ((utz) jbh.a.get()).e()).booleanValue()) {
                        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorRcsController", "updateRcsDraftSupported", 212, "DraftEditorRcsController.java")).q("DraftEditorRcsController#updateRcsDraftSupported=false because 1:1 conversation participant is not found, or is rbm");
                        return;
                    }
                    return;
                }
                this.g = true;
                if (((Boolean) ((utz) jbh.a.get()).e()).booleanValue()) {
                    ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorRcsController", "updateRcsDraftSupported", 192, "DraftEditorRcsController.java")).t("DraftEditorRcsController#updateRcsDraftSupported=%s because is rbm or rcs group", Boolean.valueOf(this.g));
                }
            }
        }
    }

    public final boolean b() {
        rsa rsaVar = this.e;
        if (rsaVar != null) {
            return rsaVar.g();
        }
        ikl iklVar = this.d;
        if (iklVar != null) {
            return iklVar.e;
        }
        return false;
    }
}
