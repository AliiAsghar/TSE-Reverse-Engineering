package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class utl implements qdj {
    private final qdj a;

    public utl(qdj qdjVar, ojo ojoVar) {
        ojoVar.getClass();
        this.a = qdjVar;
    }

    @Override // defpackage.qdj
    public final akul a(qdk qdkVar) {
        akul i;
        boolean z;
        akrh e = aktp.e("EncryptedSinglePartIncomingChatMessageProcessor::process");
        qdj qdjVar = this.a;
        try {
            if (((okg) ((tum) qdjVar).i.b()).a()) {
                qfo qfoVar = qdkVar.a;
                if ((16 & qfoVar.c) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                d.s(z);
                qei qeiVar = qfoVar.f;
                if (qeiVar == null) {
                    qeiVar = qei.a;
                }
                i = aktp.aj(new imi(qdjVar, qeiVar, 18, null), ((tum) qdjVar).h).i(new tsm(qdjVar, qdkVar, 15), ((tum) qdjVar).h);
                e.b(i);
            } else {
                i = ((tum) qdjVar).f.c().i(new tsz(qdjVar, 7), ((tum) qdjVar).h).i(new tsm(qdjVar, qdkVar, 16), ((tum) qdjVar).h);
                e.b(i);
            }
            e.close();
            return i;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
