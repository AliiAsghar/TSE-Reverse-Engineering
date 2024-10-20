package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abzu implements abzs {
    public static final apuv e = new apuv("InternalGmsDCC");
    public final Executor a;
    public final aegu b;
    public final abzz c;
    public final zfm d;

    public abzu(Context context, Executor executor) {
        acaf acafVar = new acaf(context);
        aegx aegxVar = new aegx();
        zfm zfmVar = new zfm(context.getApplicationContext().getCacheDir());
        abzz abzzVar = new abzz(aegxVar, executor, new acak(zfmVar, executor), acafVar, new addy(context, aegxVar));
        this.a = executor;
        this.d = zfmVar;
        this.b = aegxVar;
        this.c = abzzVar;
    }
}
