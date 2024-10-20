package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vnu extends arpw implements arqv {
    Object a;
    int b;
    final /* synthetic */ qhd c;
    final /* synthetic */ qei d;
    final /* synthetic */ apbt e;
    final /* synthetic */ qei f;
    final /* synthetic */ qft g;
    final /* synthetic */ boolean h;
    final /* synthetic */ uns i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnu(qhd qhdVar, qei qeiVar, apbt apbtVar, qei qeiVar2, qft qftVar, boolean z, uns unsVar, arpe arpeVar) {
        super(2, arpeVar);
        this.c = qhdVar;
        this.d = qeiVar;
        this.e = apbtVar;
        this.f = qeiVar2;
        this.g = qftVar;
        this.h = z;
        this.i = unsVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vnu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        String str;
        String str2;
        Object c;
        uns unsVar;
        Object c2;
        uns unsVar2;
        vqh vqhVar;
        uns unsVar3;
        uns unsVar4;
        upm d;
        arpl arplVar = arpl.a;
        int i = this.b;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        Object obj2 = this.a;
                        aqil.P(obj);
                        c = obj;
                        str2 = "RCS proto message send failed.";
                        unsVar = obj2;
                        vqhVar = (vqh) c;
                        unsVar4 = unsVar;
                    } else {
                        Object obj3 = this.a;
                        aqil.P(obj);
                        c2 = obj;
                        unsVar2 = obj3;
                        vqhVar = (vqh) c2;
                        unsVar3 = unsVar2;
                        str2 = "RCS proto message send failed.";
                        unsVar4 = unsVar3;
                    }
                } else {
                    Object obj4 = this.a;
                    aqil.P(obj);
                    vqhVar = (vqh) obj;
                    unsVar3 = obj4;
                    str2 = "RCS proto message send failed.";
                    unsVar4 = unsVar3;
                }
            } else {
                aqil.P(obj);
                try {
                    ((alvg) qhd.a.d().h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$2", "invokeSuspend", 155, "RcsProtoMessageSenderHandler.kt")).q("Preparing to send RCS proto message based on pre-fetched conversation properties.");
                    aoia aoiaVar = new aoia(this.d);
                    qhd qhdVar = this.c;
                    apbt apbtVar = this.e;
                    qei qeiVar = this.f;
                    qft qftVar = this.g;
                    boolean z = this.h;
                    uns unsVar5 = this.i;
                    if (z) {
                        kkg kkgVar = qhdVar.e;
                        rve a = qhdVar.d.a();
                        apwq apwqVar = apwq.a;
                        aozy createBuilder = apwq.a.createBuilder();
                        createBuilder.getClass();
                        apwq n = aovp.n(createBuilder);
                        Object obj5 = kkgVar.a;
                        int i2 = arsc.a;
                        ajrt a2 = ((ajsd) obj5).a(apbtVar, new arrh(vsn.class));
                        this.a = unsVar5;
                        this.b = 2;
                        c2 = kkgVar.c(a, a2, qeiVar, aoiaVar, qftVar, n, true, this);
                        if (c2 != arplVar) {
                            unsVar2 = unsVar5;
                            vqhVar = (vqh) c2;
                            unsVar3 = unsVar2;
                            str2 = "RCS proto message send failed.";
                            unsVar4 = unsVar3;
                        } else {
                            return arplVar;
                        }
                    } else {
                        kkg kkgVar2 = qhdVar.e;
                        rve a3 = qhdVar.d.a();
                        apwq apwqVar2 = apwq.a;
                        aozy createBuilder2 = apwq.a.createBuilder();
                        createBuilder2.getClass();
                        apwq n2 = aovp.n(createBuilder2);
                        Object obj6 = kkgVar2.a;
                        int i3 = arsc.a;
                        str2 = "RCS proto message send failed.";
                        try {
                            ajrt a4 = ((ajsd) obj6).a(apbtVar, new arrh(vsn.class));
                            this.a = unsVar5;
                            this.b = 3;
                            c = kkgVar2.c(a3, a4, qeiVar, aoiaVar, qftVar, n2, false, this);
                            if (c != arplVar) {
                                unsVar = unsVar5;
                                vqhVar = (vqh) c;
                                unsVar4 = unsVar;
                            } else {
                                return arplVar;
                            }
                        } catch (Exception e) {
                            e = e;
                            str = str2;
                            ((alvg) ((alvg) qhd.a.i()).g(e).h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$2", "invokeSuspend", 350, "RcsProtoMessageSenderHandler.kt")).q(str);
                            return upm.d();
                        }
                    }
                } catch (Exception e2) {
                    ((alvg) ((alvg) qhd.a.i()).g(e2).h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$2", "invokeSuspend", 174, "RcsProtoMessageSenderHandler.kt")).q("RCS proto message send for pre-fetched conversation properties failed.");
                    return upm.d();
                }
            }
            int i4 = vqhVar.b;
            if (i4 == 0) {
                ((alvg) qhd.a.d().h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$2", "invokeSuspend", 333, "RcsProtoMessageSenderHandler.kt")).q("RCS proto message send successful.");
                return upm.b();
            }
            if (i4 == -1) {
                ((alvg) qhd.a.d().h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$2", "invokeSuspend", 337, "RcsProtoMessageSenderHandler.kt")).q("RCS proto message send pending.");
                return upm.b();
            }
            str = str2;
            try {
                ((alvg) qhd.a.i().h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$2", "invokeSuspend", 341, "RcsProtoMessageSenderHandler.kt")).q(str);
                if (unsVar4 != null && unsVar4.c()) {
                    d = upm.e();
                } else {
                    d = upm.d();
                }
                return d;
            } catch (Exception e3) {
                e = e3;
                ((alvg) ((alvg) qhd.a.i()).g(e).h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$2", "invokeSuspend", 350, "RcsProtoMessageSenderHandler.kt")).q(str);
                return upm.d();
            }
        } catch (Exception e4) {
            e = e4;
            str = "RCS proto message send failed.";
        }
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new vnu(this.c, this.d, this.e, this.f, this.g, this.h, this.i, arpeVar);
    }
}
