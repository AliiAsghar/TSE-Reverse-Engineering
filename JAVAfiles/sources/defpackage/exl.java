package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class exl implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ exl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, esj] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Object obj = this.a;
                ((exm) obj).l.d(new ewt(obj, 14));
                return;
            case 1:
                this.a.a();
                return;
            case 2:
                eyk eykVar = ((eyh) this.a).a;
                eykVar.c.a(eykVar.n);
                return;
            case 3:
                eys eysVar = (eys) this.a;
                eysVar.b.a.a(eysVar.a);
                return;
            case 4:
                try {
                    fai.f((fbb) this.a);
                    return;
                } catch (ezo e) {
                    eub.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            case 5:
                fbt fbtVar = (fbt) this.a;
                fbtVar.F(fbtVar.A(), 1028, new ezz(3));
                fbtVar.d.e();
                return;
            case 6:
                int i = eul.a;
                fbt fbtVar2 = ((faa) ((fdx) this.a).b).a.D;
                fbtVar2.F(fbtVar2.E(), 1007, new ezz(4));
                return;
            case 7:
                int i2 = eul.a;
                fbt fbtVar3 = ((faa) ((fdx) this.a).b).a.D;
                fbtVar3.F(fbtVar3.E(), 1010, new ezz(16));
                return;
            case 8:
                int i3 = eul.a;
                fbt fbtVar4 = ((faa) ((fdx) this.a).b).a.D;
                fbtVar4.F(fbtVar4.E(), 1011, new ezz(13));
                return;
            case 9:
                int i4 = eul.a;
                fbt fbtVar5 = ((faa) ((fdx) this.a).b).a.D;
                fbtVar5.F(fbtVar5.E(), 1031, new fbn(14));
                return;
            case 10:
                int i5 = eul.a;
                fbt fbtVar6 = ((faa) ((fdx) this.a).b).a.D;
                fbtVar6.F(fbtVar6.E(), 1032, new fbr(3));
                return;
            case 11:
                int i6 = eul.a;
                fbt fbtVar7 = ((faa) ((fdx) this.a).b).a.D;
                fbtVar7.F(fbtVar7.E(), 1029, new fbr(1));
                return;
            case 12:
                int i7 = eul.a;
                fbt fbtVar8 = ((faa) ((fdx) this.a).b).a.D;
                fbtVar8.F(fbtVar8.E(), 1014, new fbr(5));
                return;
            case 13:
                int i8 = eul.a;
                fbt fbtVar9 = ((faa) ((fdx) this.a).b).a.D;
                fbtVar9.F(fbtVar9.E(), 1009, new fbn(17));
                return;
            case 14:
                int i9 = eul.a;
                fbt fbtVar10 = ((faa) ((fdx) this.a).b).a.D;
                fbtVar10.F(fbtVar10.E(), 1008, new ezz(19));
                return;
            case 15:
                int i10 = eul.a;
                fbt fbtVar11 = ((faa) ((fdx) this.a).b).a.D;
                fbtVar11.F(fbtVar11.E(), 1012, new ezz(6));
                return;
            case 16:
                fcx fcxVar = (fcx) this.a;
                if (fcxVar.N >= 300000) {
                    ((fcz) fcxVar.W.a).k = true;
                    fcxVar.N = 0L;
                    return;
                }
                return;
            case 17:
                Object obj2 = this.a;
                fdm fdmVar = (fdm) obj2;
                if (fdmVar.b) {
                    return;
                }
                fdp fdpVar = fdmVar.a;
                if (fdpVar != null) {
                    fdpVar.o(fdmVar.d);
                }
                fdmVar.c.c.remove(obj2);
                fdmVar.b = true;
                return;
            case 18:
                ((fdj) this.a).o(null);
                return;
            case 19:
                Object obj3 = this.a;
                synchronized (((fev) obj3).a) {
                    if (((fev) obj3).h) {
                        return;
                    }
                    long j = ((fev) obj3).g - 1;
                    ((fev) obj3).g = j;
                    if (j > 0) {
                        return;
                    }
                    if (j < 0) {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (((fev) obj3).a) {
                            ((fev) obj3).i = illegalStateException;
                        }
                        return;
                    }
                    ((fev) obj3).a();
                    return;
                }
            default:
                ((fhm) this.a).p = true;
                return;
        }
    }
}
