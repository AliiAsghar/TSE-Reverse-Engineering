package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahrn {
    public final Object a;
    public final Object b;
    public final Object c;

    public ahrn(Context context, aegu aeguVar, armf armfVar) {
        this.a = context;
        this.b = aeguVar;
        this.c = armfVar;
    }

    public ahrn(ahmv ahmvVar, aneo aneoVar, Executor executor, apwt apwtVar, armf armfVar) {
        this.c = apwtVar;
        this.b = aneoVar;
        this.a = ahmvVar.a(executor, apwtVar, armfVar);
    }
}
