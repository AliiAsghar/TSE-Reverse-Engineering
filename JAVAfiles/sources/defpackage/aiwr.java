package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiwr extends aiwv {
    public static final aiwv a = new aiwr();

    private aiwr() {
    }

    @Override // defpackage.aiwv
    public final String a() {
        return "singleproc";
    }

    @Override // defpackage.aiwv
    public final /* synthetic */ aiws b(aiwm aiwmVar, String str, Executor executor, agcp agcpVar) {
        aozs aozsVar;
        if (aiwmVar.e) {
            aozsVar = aozs.a();
        } else {
            aozs aozsVar2 = aozs.a;
            apcc apccVar = apcc.a;
            aozsVar = aozs.a;
        }
        aiwy aiwyVar = new aiwy(aiwmVar.b, aozsVar);
        Uri uri = aiwmVar.a;
        return new aiws(str, albo.bI(uri), aiwyVar, executor, agcpVar, aiwmVar.c, new akqp());
    }
}
