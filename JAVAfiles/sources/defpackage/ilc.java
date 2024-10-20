package defpackage;

import android.os.Build;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.apps.messaging.ui.conversation.compose.PlainTextEditText;
import com.google.android.libraries.stickers.gallery.StickerSearchView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ilc implements View.OnFocusChangeListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ilc(SearchView searchView, int i) {
        this.b = i;
        this.a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.b) {
            case 0:
                ilw ilwVar = (ilw) this.a;
                if (view == ilwVar.B && z) {
                    if (Build.VERSION.SDK_INT <= 32) {
                        ilwVar.m.isActive(ilwVar.B);
                    }
                    ilwVar.L = ilwVar.B;
                    ilwVar.K.af();
                    return;
                }
                return;
            case 1:
                Object obj = this.a;
                View.OnFocusChangeListener onFocusChangeListener = ((SearchView) obj).mOnQueryTextFocusChangeListener;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange((View) obj, z);
                    return;
                }
                return;
            case 2:
                ilw ilwVar2 = (ilw) this.a;
                EditText editText = ilwVar2.H;
                if (view == editText && z) {
                    ilwVar2.L = editText;
                    return;
                }
                return;
            case 3:
                zri zriVar = (zri) this.a;
                PlainTextEditText plainTextEditText = zriVar.n;
                if (view == plainTextEditText && z) {
                    zriVar.p = plainTextEditText;
                    zxa zxaVar = zriVar.j;
                    if (zxaVar != null) {
                        zxaVar.af();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                zri zriVar2 = (zri) this.a;
                PlainTextEditText plainTextEditText2 = zriVar2.o;
                if (view == plainTextEditText2 && z) {
                    zriVar2.p = plainTextEditText2;
                    zxa zxaVar2 = zriVar2.j;
                    if (zxaVar2 != null) {
                        zxaVar2.R(new zrf(2), new zrf(3));
                        return;
                    }
                    return;
                }
                return;
            case 5:
                Object obj2 = this.a;
                if (z) {
                    afwt afwtVar = (afwt) obj2;
                    agem b = afwtVar.b();
                    if (b != null) {
                        agem.bx(b);
                    }
                    ((ahjj) ((arrq) afwtVar.d).b()).d(agdp.b);
                    afwtVar.c.f((View) afwtVar.e.g, true);
                    afwtVar.o();
                } else {
                    afwt afwtVar2 = (afwt) obj2;
                    ((ahjj) ((arrq) afwtVar2.d).b()).d(agdp.a);
                    afwtVar2.f();
                }
                afwt afwtVar3 = (afwt) obj2;
                afwt.n(afwtVar3, null, z, 1);
                agem b2 = afwtVar3.b();
                if (b2 instanceof agep) {
                    return;
                }
                return;
            case 6:
                StickerSearchView stickerSearchView = (StickerSearchView) this.a;
                if (((InputMethodManager) stickerSearchView.getContext().getSystemService("input_method")) == null) {
                    return;
                }
                if (z) {
                    stickerSearchView.b(view);
                    return;
                } else {
                    stickerSearchView.a();
                    return;
                }
            case 7:
                ajmq ajmqVar = (ajmq) this.a;
                ajmqVar.f(ajmqVar.k());
                return;
            default:
                Object obj3 = this.a;
                ajmy ajmyVar = (ajmy) obj3;
                ajmyVar.b = z;
                ((ajnc) obj3).x();
                if (!z) {
                    ajmyVar.k(false);
                    ajmyVar.c = false;
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ilc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
