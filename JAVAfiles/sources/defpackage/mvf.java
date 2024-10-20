package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mvf {
    public static final mvf a;
    private static final /* synthetic */ mvf[] g;
    public final alog b;
    public final alog c;
    public final arqv d;
    public final arqv e;
    public final arqv f;

    static {
        alog s = alog.s(new atkn((Object) MessagesTable.c.i, false), new atkn((Object) MessagesTable.c.a, false));
        s.getClass();
        sxo sxoVar = MessagesTable.c;
        alog s2 = alog.s(new atkn((Object) sxoVar.i, true), new atkn((Object) sxoVar.a, true));
        s2.getClass();
        mvf mvfVar = new mvf(s, s2, mvc.a, mvd.a, mve.a);
        a = mvfVar;
        mvf[] mvfVarArr = {mvfVar};
        g = mvfVarArr;
        arhi.f(mvfVarArr);
    }

    private mvf(alog alogVar, alog alogVar2, arqv arqvVar, arqv arqvVar2, arqv arqvVar3) {
        this.b = alogVar;
        this.c = alogVar2;
        this.d = arqvVar;
        this.e = arqvVar2;
        this.f = arqvVar3;
    }

    public static mvf[] values() {
        return (mvf[]) g.clone();
    }
}
