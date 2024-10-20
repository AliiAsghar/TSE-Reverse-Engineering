package defpackage;

import android.R;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zhz {
    public final Context a;
    protected String b;
    protected CharSequence[] c;
    protected int d;
    protected int e = -1;
    public ev f;

    /* JADX INFO: Access modifiers changed from: protected */
    public zhz(Context context) {
        this.a = context;
    }

    public abstract void b(int i);

    public void c() {
        if (this.f != null) {
            d();
        }
        ajgi ajgiVar = new ajgi(this.a);
        ajgiVar.w(this.c, this.d, new ivs(this, 11, null));
        ajgiVar.y(this.b);
        ajgiVar.o(R.string.cancel, null);
        ev create = ajgiVar.create();
        this.f = create;
        create.setOnShowListener(new uab(this, 3, null));
        this.f.show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d() {
        ev evVar = this.f;
        if (evVar != null) {
            evVar.dismiss();
            this.f = null;
        }
    }
}
