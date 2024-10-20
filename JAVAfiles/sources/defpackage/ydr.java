package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ydr extends alvz {
    public ydr() {
        super("intent", Intent.class, false);
    }

    @Override // defpackage.alvz
    public final /* bridge */ /* synthetic */ void a(Object obj, alvy alvyVar) {
        String bh;
        Bundle extras = ((Intent) obj).getExtras();
        if (extras != null) {
            for (String str : extras.keySet()) {
                Object obj2 = extras.get(str);
                String str2 = this.a + "." + str;
                if (obj2 == null) {
                    bh = "null";
                } else {
                    bh = yyb.bh(obj2.toString());
                }
                alvyVar.a(str2, bh);
            }
        }
    }
}
