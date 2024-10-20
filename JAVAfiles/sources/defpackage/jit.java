package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jit extends arpw implements arqx {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jit(ahmv ahmvVar, arpe arpeVar, int i) {
        super(4, arpeVar);
        this.e = i;
        this.d = ahmvVar;
    }

    @Override // defpackage.arqx
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                jit jitVar = new jit((zxy) this.d, (arpe) obj4, 6, null);
                                jitVar.a = (zzf) obj;
                                jitVar.b = (zzc) obj2;
                                jitVar.c = (zze) obj3;
                                return jitVar.b(arnb.a);
                            }
                            jit jitVar2 = new jit((zxy) this.d, (arpe) obj4, 5);
                            jitVar2.a = (miu) obj;
                            jitVar2.b = (nfw) obj2;
                            jitVar2.c = (alog) obj3;
                            return jitVar2.b(arnb.a);
                        }
                        jit jitVar3 = new jit((ahmv) this.d, (arpe) obj4, 4);
                        jitVar3.a = (nfw) obj;
                        jitVar3.b = (alog) obj2;
                        jitVar3.c = (zem) obj3;
                        return jitVar3.b(arnb.a);
                    }
                    jit jitVar4 = new jit((jwp) this.d, (arpe) obj4, 3);
                    jitVar4.a = (ResolvedRecipient) obj;
                    jitVar4.b = (Optional) obj2;
                    jitVar4.c = (miu) obj3;
                    return jitVar4.b(arnb.a);
                }
                jit jitVar5 = new jit((jvs) this.d, (arpe) obj4, 2);
                jitVar5.a = (aekm) obj;
                jitVar5.b = (Integer) obj2;
                jitVar5.c = (wpn) obj3;
                return jitVar5.b(arnb.a);
            }
            jit jitVar6 = new jit((jcz) this.d, (arpe) obj4, 1);
            jitVar6.a = (alog) obj;
            jitVar6.b = (miu) obj2;
            jitVar6.c = (jxo) obj3;
            return jitVar6.b(arnb.a);
        }
        jit jitVar7 = new jit((jiu) this.d, (arpe) obj4, 0);
        jitVar7.a = (jht) obj;
        jitVar7.b = (mit) obj2;
        jitVar7.c = (jjk) obj3;
        return jitVar7.b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [miu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, nfw] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v6, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v64, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v70, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, nfw] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        ghu ghuVar;
        zep zepVar;
        zyh zyhVar;
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    String str = "";
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                aqil.P(obj);
                                ?? r15 = ((zxy) this.d).d;
                                Object obj2 = this.a;
                                Object obj3 = this.b;
                                Object obj4 = this.c;
                                return new zyz((zze) obj4, (zzf) obj2, (zzc) obj3, new zyy(false));
                            }
                            aqil.P(obj);
                            Object obj5 = this.a;
                            ?? r0 = this.b;
                            Object obj6 = this.c;
                            obj5.getClass();
                            if (!tvu.e(((mll) obj5).r()) || r0 == 0) {
                                return null;
                            }
                            if (((alog) obj6).size() < 2 && !((pcy) ((zxy) this.d).e.b()).a()) {
                                return null;
                            }
                            if (r0.k().length() == 0) {
                                String j = r0.j();
                                if (j != null) {
                                    str = j;
                                }
                                zyhVar = new zyh(str, null);
                            } else {
                                zyhVar = new zyh(r0.k(), r0.j());
                            }
                            return new zyf(new aeth(zyhVar.a, zyhVar.b, null, null, new aete(aerb.cU), yyo.l, 92));
                        }
                        aqil.P(obj);
                        ?? r6 = this.a;
                        Object obj7 = this.b;
                        Object obj8 = this.c;
                        if (r6 != 0 && ((alog) obj7).size() >= 2 && ((zepVar = ((zem) obj8).d) == zep.a || zepVar == zep.b || zepVar == zep.c)) {
                            Object obj9 = this.d;
                            return new zec(true, new aeym(new aeyn(((ahmv) obj9).f(r6), r6.k(), new kdt(obj9, obj7, (Object) r6, 19, (short[]) null))));
                        }
                        return new zec();
                    }
                    aqil.P(obj);
                    ?? r152 = this.a;
                    Object obj10 = this.b;
                    Object obj11 = this.c;
                    if ((((jwp) this.d).e instanceof RbmConversationId) && (obj11 instanceof mps)) {
                        if (!((Boolean) psn.b.e()).booleanValue()) {
                            ((alvg) jwp.a.f().h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/rbm/RbmToolstoneUiAdapterImpl$toolstoneVisibilityFlow$1", "invokeSuspend", 95, "RbmToolstoneUiAdapterImpl.kt")).q("RBM toolstone disabled by phenotype.");
                            return false;
                        }
                        if (r152.t()) {
                            ((alvg) jwp.a.f().h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/rbm/RbmToolstoneUiAdapterImpl$toolstoneVisibilityFlow$1", "invokeSuspend", 100, "RbmToolstoneUiAdapterImpl.kt")).q("RBM toolstone not shown because of non-qualifying recipient.");
                            return false;
                        }
                        if (((mps) obj11).b != psk.SHOW) {
                            ((alvg) jwp.a.f().h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/rbm/RbmToolstoneUiAdapterImpl$toolstoneVisibilityFlow$1", "invokeSuspend", 105, "RbmToolstoneUiAdapterImpl.kt")).q("RBM toolstone is not in SHOW state.");
                            return false;
                        }
                        String m = r152.f().m();
                        if (m != null) {
                            str = m;
                        }
                        String c = msx.c(str);
                        c.getClass();
                        if (c.length() != 0 && psn.c().contains(c)) {
                            Optional optional = (Optional) obj10;
                            if (optional.isPresent()) {
                                nel nelVar = (nel) optional.get();
                                String name = nelVar.a.f().name();
                                String a = nelVar.a();
                                if (psn.a().contains(name)) {
                                    ((alvg) jwp.a.f().h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/rbm/RbmToolstoneUiAdapterImpl$toolstoneVisibilityFlow$1", "invokeSuspend", 126, "RbmToolstoneUiAdapterImpl.kt")).t("RBM toolstone not shown due to agent use case: %s.", name);
                                    return false;
                                }
                                if (psn.b().contains(a)) {
                                    ((alvg) jwp.a.f().h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/rbm/RbmToolstoneUiAdapterImpl$toolstoneVisibilityFlow$1", "invokeSuspend", 133, "RbmToolstoneUiAdapterImpl.kt")).t("RBM toolstone not shown due to business ID being in toolstone bypass allowlist: %s.", a);
                                    return false;
                                }
                                return true;
                            }
                        }
                        ((alvg) jwp.a.f().h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/rbm/RbmToolstoneUiAdapterImpl$toolstoneVisibilityFlow$1", "invokeSuspend", 118, "RbmToolstoneUiAdapterImpl.kt")).q("RBM toolstone not shown because of non-qualifying business domain.");
                        return false;
                    }
                    ((alvg) jwp.a.f().h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/rbm/RbmToolstoneUiAdapterImpl$toolstoneVisibilityFlow$1", "invokeSuspend", 90, "RbmToolstoneUiAdapterImpl.kt")).q("RBM toolstone disabled because we are not in an RBM conversation.");
                    return false;
                }
                aqil.P(obj);
                Object obj12 = this.a;
                Object obj13 = this.b;
                boolean z = !((wpn) this.c).a();
                Object obj14 = this.d;
                jvs jvsVar = (jvs) obj14;
                aeph a2 = jvsVar.a();
                ghu ghuVar2 = new ghu(obj14, 10, (int[][]) null);
                rl rlVar = new rl(obj14, 20, (char[]) null, (byte[]) null);
                ghu ghuVar3 = new ghu(obj14, 11, (boolean[][]) null);
                if (((Boolean) jvsVar.f.b()).booleanValue()) {
                    ghuVar = new ghu(this.d, 12, (float[][]) null);
                } else {
                    ghuVar = null;
                }
                return new aepp((aekm) obj12, z, a2, ghuVar2, rlVar, ghuVar3, ghuVar, ((jvs) this.d).b((Integer) obj13));
            }
            aqil.P(obj);
            ?? r153 = this.a;
            ?? r02 = this.b;
            Object obj15 = this.c;
            if (!r02.q() && r02.b() == mit.ONE_ON_ONE && !r153.isEmpty() && !((ResolvedRecipient) aqjn.ag(r153)).u() && obj15 != null) {
                jcz jczVar = (jcz) this.d;
                if (jczVar.b.e) {
                    String string = jczVar.a.getString(R.string.action_add_contact);
                    string.getClass();
                    return new aehz(string, null, false, true, false, false, null, null, new bp(this.d, (Object) r153, obj15, 15), 1014);
                }
            }
            return null;
        }
        aqil.P(obj);
        return jiu.a((mit) this.b, (jht) this.a, (jjk) this.c);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jit(jcz jczVar, arpe arpeVar, int i) {
        super(4, arpeVar);
        this.e = i;
        this.d = jczVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jit(jiu jiuVar, arpe arpeVar, int i) {
        super(4, arpeVar);
        this.e = i;
        this.d = jiuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jit(jvs jvsVar, arpe arpeVar, int i) {
        super(4, arpeVar);
        this.e = i;
        this.d = jvsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jit(jwp jwpVar, arpe arpeVar, int i) {
        super(4, arpeVar);
        this.e = i;
        this.d = jwpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jit(zxy zxyVar, arpe arpeVar, int i) {
        super(4, arpeVar);
        this.e = i;
        this.d = zxyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jit(zxy zxyVar, arpe arpeVar, int i, byte[] bArr) {
        super(4, arpeVar);
        this.e = i;
        this.d = zxyVar;
    }
}
