package defpackage;

import java.net.SocketTimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aigg implements aipj {
    INIT,
    ACCEPTING,
    ACCEPTED,
    CONNECTING,
    CONNECTED,
    AUTHENTICATING,
    AUTHENTICATED,
    ACTIVE,
    CLOSING,
    CLOSED,
    FAILED;

    public static final aiim l;
    public static final aiim m;
    public static final aiim n;
    public static final aiim o;
    private static final asqc q;

    static {
        aigg aiggVar = INIT;
        aigg aiggVar2 = ACCEPTING;
        aigg aiggVar3 = ACCEPTED;
        aigg aiggVar4 = CONNECTING;
        aigg aiggVar5 = CONNECTED;
        aigg aiggVar6 = AUTHENTICATING;
        aigg aiggVar7 = AUTHENTICATED;
        aigg aiggVar8 = ACTIVE;
        aigg aiggVar9 = CLOSING;
        aigg aiggVar10 = CLOSED;
        aigg aiggVar11 = FAILED;
        asqc asqcVar = new asqc(alor.j(alor.l(SocketTimeoutException.class, aiggVar8)));
        q = asqcVar;
        alpu alpuVar = new alpu();
        alpuVar.k(aiggVar, aiggVar4);
        alpuVar.k(aiggVar4, aiggVar5, aiggVar9);
        alpuVar.k(aiggVar5, aiggVar8, aiggVar9);
        alpuVar.k(aiggVar8, aiggVar8, aiggVar9);
        alpuVar.k(aiggVar9, aiggVar9, aiggVar10);
        l = new aiim(aiggVar, aiggVar11, alpuVar.a(), alor.l(aiggVar8, asqcVar));
        alpu alpuVar2 = new alpu();
        alpuVar2.k(aiggVar, aiggVar2);
        alpuVar2.k(aiggVar2, aiggVar2, aiggVar5, aiggVar9);
        alpuVar2.k(aiggVar5, aiggVar8, aiggVar9);
        alpuVar2.k(aiggVar8, aiggVar8, aiggVar9);
        alpuVar2.k(aiggVar9, aiggVar9, aiggVar10);
        m = new aiim(aiggVar, aiggVar11, alpuVar2.a(), alor.l(aiggVar8, asqcVar));
        alpu alpuVar3 = new alpu();
        alpuVar3.k(aiggVar, aiggVar3);
        alpuVar3.k(aiggVar3, aiggVar8, aiggVar9);
        alpuVar3.k(aiggVar8, aiggVar8, aiggVar9);
        alpuVar3.k(aiggVar9, aiggVar9, aiggVar10);
        n = new aiim(aiggVar, aiggVar11, alpuVar3.a(), alor.l(aiggVar8, asqcVar));
        alpu alpuVar4 = new alpu();
        alpuVar4.k(aiggVar, aiggVar4);
        alpuVar4.k(aiggVar4, aiggVar5, aiggVar9);
        alpuVar4.k(aiggVar5, aiggVar6, aiggVar9);
        alpuVar4.k(aiggVar6, aiggVar7, aiggVar9);
        alpuVar4.k(aiggVar7, aiggVar8, aiggVar9);
        alpuVar4.k(aiggVar8, aiggVar8, aiggVar9);
        alpuVar4.k(aiggVar9, aiggVar9, aiggVar10);
        o = new aiim(aiggVar, aiggVar11, alpuVar4.a(), alor.l(aiggVar8, asqcVar));
        alpu alpuVar5 = new alpu();
        alpuVar5.k(aiggVar, aiggVar2);
        alpuVar5.k(aiggVar2, aiggVar2, aiggVar5, aiggVar9);
        alpuVar5.k(aiggVar5, aiggVar6, aiggVar9);
        alpuVar5.k(aiggVar6, aiggVar7, aiggVar9);
        alpuVar5.k(aiggVar7, aiggVar8, aiggVar9);
        alpuVar5.k(aiggVar8, aiggVar8, aiggVar9);
        alpuVar5.k(aiggVar9, aiggVar9, aiggVar10);
        new aiim(aiggVar, aiggVar11, alpuVar5.a(), alor.l(aiggVar8, asqcVar));
        alpu alpuVar6 = new alpu();
        alpuVar6.k(aiggVar, aiggVar3);
        alpuVar6.k(aiggVar3, aiggVar8, aiggVar9);
        alpuVar6.k(aiggVar8, aiggVar8, aiggVar9);
        alpuVar6.k(aiggVar9, aiggVar9, aiggVar10);
        new aiim(aiggVar, aiggVar11, alpuVar6.a(), alor.l(aiggVar8, asqcVar));
    }
}
