package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jeh extends arpw implements arqw {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ Context c;
    final /* synthetic */ jei d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jeh(Context context, jei jeiVar, arpe arpeVar) {
        super(3, arpeVar);
        this.c = context;
        this.d = jeiVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        jeh jehVar = new jeh(this.c, this.d, (arpe) obj3);
        jehVar.a = booleanValue;
        jehVar.b = (khd) obj2;
        return jehVar.b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        boolean z = this.a;
        Object obj2 = this.b;
        khd khdVar = (khd) obj2;
        aerb aerbVar = null;
        if (khdVar.a.size() != 1 || !((miz) aqjn.ag(khdVar.a)).m()) {
            return null;
        }
        String string = this.c.getString(R.string.message_context_menu_forward_message);
        string.getClass();
        if (z) {
            aerbVar = aerb.aY;
        }
        return new aehz(string, aerbVar, false, !z, true, false, null, null, new jdr(this.d, obj2, 7), 996);
    }
}
