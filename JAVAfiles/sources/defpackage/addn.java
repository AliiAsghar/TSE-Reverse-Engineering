package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class addn implements andy {
    private final addo a;
    private final addm b;
    private final /* synthetic */ int c;

    public addn(addm addmVar, addo addoVar, int i) {
        this.c = i;
        this.b = addmVar;
        this.a = addoVar;
    }

    @Override // defpackage.andy
    public final void a(Throwable th) {
        if (this.c != 0) {
            wbk wbkVar = this.a.b.e;
            if (wbkVar == null) {
                wbkVar = wbk.a;
            }
            wcy wcyVar = wbkVar.e;
            if (wcyVar == null) {
                wcyVar = wcy.a;
            }
            advr.i(th, "[conversationId:{%s}]: Notification failure for group: {%s}", wcyVar.c, th.getMessage());
            this.a.a(th);
            this.b.a();
            return;
        }
        addo addoVar = this.a;
        wbk wbkVar2 = addoVar.b.e;
        if (wbkVar2 == null) {
            wbkVar2 = wbk.a;
        }
        wcy wcyVar2 = wbkVar2.e;
        if (wcyVar2 == null) {
            wcyVar2 = wcy.a;
        }
        String str = wcyVar2.c;
        wcr wcrVar = addoVar.b;
        int i = wcrVar.c;
        if (i == 2) {
            wca wcaVar = ((wcv) wcrVar.d).e;
            if (wcaVar == null) {
                wcaVar = wca.b;
            }
            wda wdaVar = wcaVar.d;
            if (wdaVar == null) {
                wdaVar = wda.a;
            }
            advr.i(th, "[conversationId:%s, messageId: %s]: Notification failure for message: %s", str, wdaVar.c, th.getMessage());
        } else if (i == 3) {
            advr.i(th, "[conversationId:%s]: Notification failure for group: %s", str, th.getMessage());
        }
        this.a.a(th);
        this.b.a();
    }

    @Override // defpackage.andy
    public final /* synthetic */ void b(Object obj) {
        if (this.c != 0) {
            wcu wcuVar = (wcu) obj;
            aozy createBuilder = wcs.a.createBuilder();
            wbk wbkVar = this.a.b.e;
            if (wbkVar == null) {
                wbkVar = wbk.a;
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            wcs wcsVar = (wcs) apagVar;
            wbkVar.getClass();
            wcsVar.e = wbkVar;
            wcsVar.b |= 1;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            apag apagVar2 = createBuilder.b;
            wcs wcsVar2 = (wcs) apagVar2;
            wcuVar.getClass();
            wcsVar2.d = wcuVar;
            wcsVar2.c = 3;
            int i = this.a.b.h;
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            wcs wcsVar3 = (wcs) createBuilder.b;
            wcsVar3.b |= 4;
            wcsVar3.g = i;
            apct j = aotl.j(this.b.b.f());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wcs wcsVar4 = (wcs) createBuilder.b;
            j.getClass();
            wcsVar4.f = j;
            wcsVar4.b = 2 | wcsVar4.b;
            wcs wcsVar5 = (wcs) createBuilder.s();
            adqg.i(this.a, wcsVar5);
            wdf b = wdf.b(wcuVar.c);
            if (b == null) {
                b = wdf.RESPONSE_STATUS_UNKNOWN;
            }
            if (b.equals(wdf.RESPONSE_STATUS_OK)) {
                this.a.b(wcsVar5);
                this.b.a();
                return;
            } else {
                if (this.b.c(this.a)) {
                    return;
                }
                adqg.h(this.a, wcsVar5);
                this.a.b(wcsVar5);
                this.b.a();
                return;
            }
        }
        wcw wcwVar = (wcw) obj;
        aozy createBuilder2 = wcs.a.createBuilder();
        wbk wbkVar2 = this.a.b.e;
        if (wbkVar2 == null) {
            wbkVar2 = wbk.a;
        }
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar3 = createBuilder2.b;
        wcs wcsVar6 = (wcs) apagVar3;
        wbkVar2.getClass();
        wcsVar6.e = wbkVar2;
        wcsVar6.b |= 1;
        if (!apagVar3.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar4 = createBuilder2.b;
        wcs wcsVar7 = (wcs) apagVar4;
        wcwVar.getClass();
        wcsVar7.d = wcwVar;
        wcsVar7.c = 2;
        int i2 = this.a.b.h;
        if (!apagVar4.isMutable()) {
            createBuilder2.u();
        }
        wcs wcsVar8 = (wcs) createBuilder2.b;
        wcsVar8.b |= 4;
        wcsVar8.g = i2;
        apct j2 = aotl.j(this.b.b.f());
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        wcs wcsVar9 = (wcs) createBuilder2.b;
        j2.getClass();
        wcsVar9.f = j2;
        wcsVar9.b = 2 | wcsVar9.b;
        wcs wcsVar10 = (wcs) createBuilder2.s();
        adqg.i(this.a, wcsVar10);
        wdf b2 = wdf.b(wcwVar.c);
        if (b2 == null) {
            b2 = wdf.RESPONSE_STATUS_UNKNOWN;
        }
        if (b2.equals(wdf.RESPONSE_STATUS_OK)) {
            this.a.b(wcsVar10);
            this.b.a();
        } else {
            if (this.b.c(this.a)) {
                return;
            }
            adqg.h(this.a, wcsVar10);
            this.a.b(wcsVar10);
            this.b.a();
        }
    }
}
