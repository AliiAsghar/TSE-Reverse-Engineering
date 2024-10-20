package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vnv extends arpw implements arqv {
    Object a;
    int b;
    final /* synthetic */ qhd c;
    final /* synthetic */ qei d;
    final /* synthetic */ apbt e;
    final /* synthetic */ qei f;
    final /* synthetic */ rve g;
    final /* synthetic */ qft h;
    final /* synthetic */ boolean i;
    final /* synthetic */ uns j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnv(qhd qhdVar, qei qeiVar, apbt apbtVar, qei qeiVar2, rve rveVar, qft qftVar, boolean z, uns unsVar, arpe arpeVar) {
        super(2, arpeVar);
        this.c = qhdVar;
        this.d = qeiVar;
        this.e = apbtVar;
        this.f = qeiVar2;
        this.g = rveVar;
        this.h = qftVar;
        this.i = z;
        this.j = unsVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vnv) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [uns] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        String str;
        Object obj2;
        String str2;
        Object obj3;
        Object obj4;
        vqh vqhVar;
        ?? r0;
        upm d;
        Object obj5;
        arpl arplVar = arpl.a;
        int i = this.b;
        try {
            if (i != 0) {
                try {
                    if (i != 1) {
                        Object obj6 = this.a;
                        aqil.P(obj);
                        obj3 = obj;
                        str2 = "RCS proto message send failed.";
                        obj5 = obj6;
                        vqhVar = (vqh) obj3;
                        r0 = obj5;
                    } else {
                        Object obj7 = this.a;
                        aqil.P(obj);
                        obj2 = obj;
                        str2 = "RCS proto message send failed.";
                        obj4 = obj7;
                        vqhVar = (vqh) obj2;
                        r0 = obj4;
                    }
                } catch (Exception e) {
                    e = e;
                    str = "RCS proto message send failed.";
                    ((alvg) ((alvg) qhd.a.i()).g(e).h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$4", "invokeSuspend", 511, "RcsProtoMessageSenderHandler.kt")).q(str);
                    return upm.d();
                }
            } else {
                aqil.P(obj);
                try {
                    ((alvg) qhd.a.d().h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$4", "invokeSuspend", 194, "RcsProtoMessageSenderHandler.kt")).q("Preparing to send RCS proto message based on pre-fetched conversation properties.");
                    aoia aoiaVar = new aoia(this.d);
                    qhd qhdVar = this.c;
                    apbt apbtVar = this.e;
                    qei qeiVar = this.f;
                    rve rveVar = this.g;
                    qft qftVar = this.h;
                    boolean z = this.i;
                    uns unsVar = this.j;
                    if (!z) {
                        str2 = "RCS proto message send failed.";
                        kkg kkgVar = qhdVar.e;
                        apwq apwqVar = apwq.a;
                        aozy createBuilder = apwq.a.createBuilder();
                        createBuilder.getClass();
                        apwq n = aovp.n(createBuilder);
                        Object obj8 = kkgVar.a;
                        int i2 = arsc.a;
                        ajrt a = ((ajsd) obj8).a(apbtVar, new arrh(vsn.class));
                        this.a = unsVar;
                        this.b = 2;
                        obj3 = kkgVar.c(rveVar, a, qeiVar, aoiaVar, qftVar, n, false, this);
                        if (obj3 != arplVar) {
                            obj5 = unsVar;
                            vqhVar = (vqh) obj3;
                            r0 = obj5;
                        } else {
                            return arplVar;
                        }
                    } else {
                        try {
                            kkg kkgVar2 = qhdVar.e;
                            apwq apwqVar2 = apwq.a;
                            aozy createBuilder2 = apwq.a.createBuilder();
                            createBuilder2.getClass();
                            apwq n2 = aovp.n(createBuilder2);
                            Object obj9 = kkgVar2.a;
                            int i3 = arsc.a;
                            str2 = "RCS proto message send failed.";
                            ajrt a2 = ((ajsd) obj9).a(apbtVar, new arrh(vsn.class));
                            this.a = unsVar;
                            this.b = 1;
                            obj2 = kkgVar2.c(rveVar, a2, qeiVar, aoiaVar, qftVar, n2, true, this);
                            if (obj2 != arplVar) {
                                obj4 = unsVar;
                                vqhVar = (vqh) obj2;
                                r0 = obj4;
                            } else {
                                return arplVar;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str = "RCS proto message send failed.";
                            ((alvg) ((alvg) qhd.a.i()).g(e).h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$4", "invokeSuspend", 511, "RcsProtoMessageSenderHandler.kt")).q(str);
                            return upm.d();
                        }
                    }
                } catch (Exception e3) {
                    ((alvg) ((alvg) qhd.a.i()).g(e3).h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$4", "invokeSuspend", 214, "RcsProtoMessageSenderHandler.kt")).q("RCS proto message send for pre-fetched conversation properties failed.");
                    return upm.d();
                }
            }
            int i4 = vqhVar.b;
            if (i4 == 0) {
                ((alvg) qhd.a.d().h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$4", "invokeSuspend", 494, "RcsProtoMessageSenderHandler.kt")).q("RCS proto message send successful.");
                return upm.b();
            }
            if (i4 == -1) {
                ((alvg) qhd.a.d().h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$4", "invokeSuspend", 498, "RcsProtoMessageSenderHandler.kt")).q("RCS proto message send pending.");
                return upm.b();
            }
            str = str2;
            try {
                ((alvg) qhd.a.i().h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$4", "invokeSuspend", 502, "RcsProtoMessageSenderHandler.kt")).q(str);
                if (r0 != 0 && r0.c()) {
                    d = upm.e();
                } else {
                    d = upm.d();
                }
                return d;
            } catch (Exception e4) {
                e = e4;
                ((alvg) ((alvg) qhd.a.i()).g(e).h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$4", "invokeSuspend", 511, "RcsProtoMessageSenderHandler.kt")).q(str);
                return upm.d();
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new vnv(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, arpeVar);
    }
}
