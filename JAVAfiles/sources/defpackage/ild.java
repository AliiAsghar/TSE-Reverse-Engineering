package defpackage;

import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.libraries.stickers.gallery.StickerSearchView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ild implements TextView.OnEditorActionListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ild(ViewGroup viewGroup, int i) {
        this.b = i;
        this.a = viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.CharSequence, java.lang.Object, android.text.Editable] */
    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i2;
        int i3 = this.b;
        if (i3 != 0) {
            if (i3 != 1) {
                arnb arnbVar = null;
                if (i3 != 2) {
                    if (i3 != 3) {
                        Editable text = ((StickerSearchView) this.a).a.getText();
                        if (!TextUtils.isEmpty(text)) {
                            airc aircVar = ((StickerSearchView) this.a).d;
                            if (aircVar != null) {
                                aircVar.d = text.toString();
                                aircVar.b.removeCallbacks(aircVar.c);
                                aircVar.c = new ahsa(aircVar, 10);
                                aircVar.b.post(aircVar.c);
                            }
                            ((StickerSearchView) this.a).a();
                        }
                        return true;
                    }
                    arml a = armd.a(afrg.h);
                    Object obj = this.a;
                    switch (i) {
                        case 2:
                        case 5:
                        case 7:
                        default:
                            return false;
                        case 3:
                            arqr arqrVar = ((ayb) obj).d;
                            if (arqrVar != null) {
                                arqrVar.a(afzv.l(a));
                                arnbVar = arnb.a;
                            }
                            if (arnbVar == null) {
                                return false;
                            }
                            break;
                        case 4:
                            arqr arqrVar2 = ((ayb) obj).e;
                            if (arqrVar2 != null) {
                                arqrVar2.a(afzv.l(a));
                                arnbVar = arnb.a;
                            }
                            if (arnbVar == null) {
                                return false;
                            }
                            break;
                        case 6:
                            arqr arqrVar3 = ((ayb) obj).b;
                            if (arqrVar3 != null) {
                                arqrVar3.a(afzv.l(a));
                                arnbVar = arnb.a;
                            }
                            if (arnbVar == null) {
                                return false;
                            }
                            break;
                    }
                    return true;
                }
                if (i == 3) {
                    afwt afwtVar = (afwt) this.a;
                    ?? text2 = ((EditText) afwtVar.e.g).getText();
                    text2.getClass();
                    if (true != arsd.M(text2)) {
                        arnbVar = text2;
                    }
                    if (arnbVar != null) {
                        afwtVar.o();
                    }
                }
                return false;
            }
            ((SearchView) this.a).onSubmitQuery();
            return true;
        }
        if (i != 4) {
            return false;
        }
        ilw ilwVar = (ilw) this.a;
        mbh mbhVar = new mbh(((xnv) ilwVar.f.b()).f().toEpochMilli(), ((xnv) ilwVar.f.b()).a());
        if (true != ilwVar.y.E().V()) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        ilwVar.y(mbhVar, true, true, false, i2);
        return true;
    }

    public /* synthetic */ ild(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
