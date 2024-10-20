package defpackage;

import java.net.Socket;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aifw implements aipi {
    public final /* synthetic */ aifx a;
    public final /* synthetic */ Socket b;
    private final /* synthetic */ int c;

    public /* synthetic */ aifw(aifx aifxVar, Socket socket, int i) {
        this.c = i;
        this.a = aifxVar;
        this.b = socket;
    }

    @Override // defpackage.aipi
    public final void a(aipc aipcVar) {
        if (this.c != 0) {
            if (ahji.r(aipcVar)) {
                Socket socket = this.b;
                aifx aifxVar = this.a;
                aifxVar.b.l(ahji.s(aifxVar.a, socket, aipcVar));
                return;
            }
            return;
        }
        if (ahji.r(aipcVar)) {
            Socket socket2 = this.b;
            aifx aifxVar2 = this.a;
            aifxVar2.b.l(ahji.s(aifxVar2.a, socket2, aipcVar));
        }
    }
}
