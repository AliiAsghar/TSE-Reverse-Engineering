package defpackage;

import android.R;
import com.google.android.material.snackbar.Snackbar;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ile implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ ile(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        int i = 1;
        int i2 = 0;
        switch (this.a) {
            case 0:
                ((aaex) obj).c();
                return;
            case 1:
                ((inn) obj).j();
                return;
            case 2:
                Snackbar snackbar = (Snackbar) obj;
                snackbar.t(R.string.ok, new ili(i2));
                snackbar.i();
                return;
            case 3:
                alwo alwoVar = ilw.a;
                ((aaex) obj).a();
                return;
            case 4:
                Snackbar snackbar2 = (Snackbar) obj;
                snackbar2.t(R.string.ok, new ili(i));
                snackbar2.i();
                return;
            case 5:
                alwo alwoVar2 = ilw.a;
                ((inn) obj).r(ins.IME, true, false);
                return;
            case 6:
                ((Snackbar) obj).i();
                return;
            case 7:
                ((jcb) obj).f();
                return;
            case 8:
                return;
            case 9:
                return;
            case 10:
                ((aaqd) obj).p();
                return;
            case 11:
                ((aaqd) obj).g();
                return;
            case 12:
                return;
            case 13:
                return;
            case 14:
                ((lyg) obj).I();
                return;
            case 15:
                ((lyg) obj).F();
                return;
            case 16:
                Collection.EL.stream(((iqw) obj).a()).forEach(new isb(2));
                return;
            case 17:
                utz utzVar = itb.a;
                ((iqw) obj).c();
                return;
            case 18:
                utz utzVar2 = itb.a;
                xzb.k("BugleTyping", "%s typing", yyb.bh((String) obj));
                return;
            case 19:
                ((woj) obj).p();
                return;
            default:
                ((nt) obj).h();
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case 6:
                return Consumer$CC.$default$andThen(this, consumer);
            case 7:
                return Consumer$CC.$default$andThen(this, consumer);
            case 8:
                return Consumer$CC.$default$andThen(this, consumer);
            case 9:
                return Consumer$CC.$default$andThen(this, consumer);
            case 10:
                return Consumer$CC.$default$andThen(this, consumer);
            case 11:
                return Consumer$CC.$default$andThen(this, consumer);
            case 12:
                return Consumer$CC.$default$andThen(this, consumer);
            case 13:
                return Consumer$CC.$default$andThen(this, consumer);
            case 14:
                return Consumer$CC.$default$andThen(this, consumer);
            case 15:
                return Consumer$CC.$default$andThen(this, consumer);
            case 16:
                return Consumer$CC.$default$andThen(this, consumer);
            case 17:
                return Consumer$CC.$default$andThen(this, consumer);
            case 18:
                return Consumer$CC.$default$andThen(this, consumer);
            case 19:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }
}
