package defpackage;

import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.google.android.libraries.stickers.gallery.StickerSearchView;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aflc implements TextWatcher {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aflc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.b != 0) {
            return;
        }
        Iterator it = ((afld) this.a).b.iterator();
        while (it.hasNext()) {
            ((aflj) it.next()).a(String.valueOf(editable));
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.b;
        if (i4 != 0) {
            if (i4 != 1) {
                int i5 = 0;
                if (i4 != 2) {
                    if (i4 != 3) {
                        ((ajai) this.a).a.a(charSequence.toString().trim());
                        return;
                    }
                    if (true == TextUtils.isEmpty(charSequence)) {
                        i5 = 4;
                    }
                    ((StickerSearchView) this.a).b.setVisibility(i5);
                    StickerSearchView stickerSearchView = (StickerSearchView) this.a;
                    if (stickerSearchView.d != null && !TextUtils.equals(charSequence, stickerSearchView.c)) {
                        airc aircVar = ((StickerSearchView) this.a).d;
                        aircVar.d = charSequence.toString();
                        aircVar.b.removeCallbacks(aircVar.c);
                        aircVar.c = new ahsa(aircVar, 11);
                        aircVar.b.postDelayed(aircVar.c, 500L);
                    }
                    ((StickerSearchView) this.a).c = charSequence.toString();
                    return;
                }
                charSequence.getClass();
                ((afwt) this.a).o();
                afwt.n((afwt) this.a, charSequence, false, 2);
                return;
            }
            ((SearchView) this.a).onTextChanged(charSequence);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
