package defpackage;

import com.google.android.apps.messaging.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kby extends arrp implements arqg {
    final /* synthetic */ kcc a;
    final /* synthetic */ boolean b;
    final /* synthetic */ String c;
    final /* synthetic */ boolean d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kby(kcc kccVar, int i, boolean z, String str, boolean z2) {
        super(0);
        this.a = kccVar;
        this.e = i;
        this.b = z;
        this.c = str;
        this.d = z2;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        boolean z;
        String string = this.a.a.getString(R.string.message_bubble_unsupported_content);
        string.getClass();
        if (this.e == 2) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = this.d;
        String str = this.c;
        return new aezf(string, null, this.b, false, str, z2, z, null, false, null, null, null, false, false, null, false, null, 1834774);
    }
}
