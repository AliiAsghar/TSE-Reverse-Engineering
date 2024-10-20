package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.Prekey;
import com.google.communication.synapse.security.scytale.PrekeyBundle;
import com.google.communication.synapse.security.scytale.UserDevices;
import com.google.media.webrtc.common.StatusOr;
import io.grpc.Status;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class twc {
    public static final vdh a = vdh.a("Bugle.Etouffee.DownloadPreKeys");
    public static final vdh b = vdh.a("Bugle.Etouffee.UploadPreKeys");
    public final apwt c;
    public final String d;
    public final armf e;
    private final anen f;

    public twc(apwt apwtVar, String str, armf armfVar, anen anenVar) {
        this.c = apwtVar;
        this.d = str;
        this.e = armfVar;
        this.f = anenVar;
    }

    public static Prekey a(aqfr aqfrVar) {
        return new Prekey(aqfrVar.b, aqfrVar.c.H(), aqfrVar.d.H());
    }

    public final void b(Status status) {
        int V = a.V(status.getCode().value());
        maq maqVar = (maq) this.e.b();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_E2EE_FETCH_PREKEYS_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        aozy createBuilder = amka.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amka amkaVar = (amka) createBuilder.b;
        amkaVar.c = a.as(V);
        amkaVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amka amkaVar2 = (amka) createBuilder.s();
        amkaVar2.getClass();
        amfrVar2.av = amkaVar2;
        amfrVar2.e |= 32;
        maqVar.j(amfqVar);
    }

    public final ListenableFuture c(final ArrayList arrayList) {
        return ((vcc) this.c.b()).b(new ttc(arrayList, this.d), a).e(aqwb.class, new ttg(this, 12), this.f).h(new algk() { // from class: twb
            @Override // defpackage.algk
            public final Object apply(Object obj) {
                Prekey prekey;
                aqif aqifVar = (aqif) obj;
                ArrayList arrayList2 = new ArrayList();
                for (aqie aqieVar : aqifVar.c) {
                    for (aqid aqidVar : aqieVar.c) {
                        if ((aqidVar.b & 2) != 0) {
                            int i = aqidVar.c;
                            aqfn aqfnVar = aqieVar.b;
                            if (aqfnVar == null) {
                                aqfnVar = aqfn.a;
                            }
                            String str = aqfnVar.c;
                            String D = aqidVar.d.D();
                            if ((aqidVar.b & 1) != 0) {
                                aqfr aqfrVar = aqidVar.f;
                                if (aqfrVar == null) {
                                    aqfrVar = aqfr.a;
                                }
                                prekey = twc.a(aqfrVar);
                            } else {
                                prekey = null;
                            }
                            Prekey prekey2 = prekey;
                            aqfr aqfrVar2 = aqidVar.g;
                            if (aqfrVar2 == null) {
                                aqfrVar2 = aqfr.a;
                            }
                            arrayList2.add(new PrekeyBundle(i, str, D, prekey2, twc.a(aqfrVar2), aqidVar.e.H()));
                        }
                    }
                }
                twc twcVar = twc.this;
                if (arrayList2.isEmpty()) {
                    twcVar.b(Status.g);
                    return StatusOr.fromStatus(Status.g);
                }
                ArrayList arrayList3 = arrayList;
                int size = arrayList3.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    i2 += ((UserDevices) arrayList3.get(i3)).getDeviceIds().size();
                }
                int size2 = arrayList3.size();
                int size3 = aqifVar.c.size();
                int size4 = arrayList2.size();
                maq maqVar = (maq) twcVar.e.b();
                amfq amfqVar = (amfq) amfr.a.createBuilder();
                amfp amfpVar = amfp.BUGLE_E2EE_FETCH_PREKEYS_EVENT;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar = (amfr) amfqVar.b;
                amfrVar.i = amfpVar.dg;
                amfrVar.b |= 1;
                aozy createBuilder = amka.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amka amkaVar = (amka) createBuilder.b;
                amkaVar.c = a.as(2);
                amkaVar.b |= 1;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                amka amkaVar2 = (amka) apagVar;
                amkaVar2.b = 2 | amkaVar2.b;
                amkaVar2.d = size2;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar2 = createBuilder.b;
                amka amkaVar3 = (amka) apagVar2;
                amkaVar3.b |= 4;
                amkaVar3.e = size3;
                if (!apagVar2.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar3 = createBuilder.b;
                amka amkaVar4 = (amka) apagVar3;
                amkaVar4.b |= 8;
                amkaVar4.f = i2;
                if (!apagVar3.isMutable()) {
                    createBuilder.u();
                }
                amka amkaVar5 = (amka) createBuilder.b;
                amkaVar5.b |= 16;
                amkaVar5.g = size4;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar2 = (amfr) amfqVar.b;
                amka amkaVar6 = (amka) createBuilder.s();
                amkaVar6.getClass();
                amfrVar2.av = amkaVar6;
                amfrVar2.e |= 32;
                maqVar.j(amfqVar);
                return StatusOr.fromValue(arrayList2);
            }
        }, andi.a);
    }
}
