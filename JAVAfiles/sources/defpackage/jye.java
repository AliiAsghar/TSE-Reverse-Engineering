package defpackage;

import com.google.android.apps.messaging.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jye extends arpw implements arqw {
    /* synthetic */ boolean a;
    /* synthetic */ int b;
    final /* synthetic */ jyk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jye(jyk jykVar, arpe arpeVar) {
        super(3, arpeVar);
        this.c = jykVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int intValue = ((Number) obj2).intValue();
        jye jyeVar = new jye(this.c, (arpe) obj3);
        jyeVar.a = booleanValue;
        jyeVar.b = intValue;
        return jyeVar.b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        boolean z = this.a;
        int i = this.b;
        jyk jykVar = this.c;
        String b = jyk.b(i, jykVar.g);
        String P = gvf.P(this.c.g, R.string.conversation_scroll_to_bottom_button_content_description, "count", new Integer(i));
        aeyk aeykVar = jykVar.y;
        boolean z2 = aeykVar.d;
        return new aeyk(z, P, b, aeykVar.e);
    }
}
