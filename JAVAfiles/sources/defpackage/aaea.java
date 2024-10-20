package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaea implements aknc {
    public final Context a;
    public final arwe b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;

    public aaea(Context context, arwe arweVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        context.getClass();
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        this.a = context;
        this.b = arweVar;
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.f = armfVar4;
    }

    public static final String b(Intent intent) {
        Uri data;
        if (intent != null && (data = intent.getData()) != null) {
            return data.getQueryParameter("bot-id");
        }
        return null;
    }

    @Override // defpackage.aknc
    public final aknb a(akmy akmyVar) {
        return new aadz(akmyVar, this, 0);
    }
}
