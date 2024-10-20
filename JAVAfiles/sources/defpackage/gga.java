package defpackage;

import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gga implements View.OnKeyListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gga(ajap ajapVar, int i) {
        this.b = i;
        this.a = ajapVar;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i == 4) {
                    ajap ajapVar = (ajap) this.a;
                    ajapVar.j(ajapVar.d, ajapVar.k, ajapVar.h, aizr.j(ajapVar.f));
                    ajapVar.b.dismissAllowingStateLoss();
                    if (ajapVar.j) {
                        return true;
                    }
                }
                return false;
            }
            SearchView searchView = (SearchView) this.a;
            if (searchView.mSearchable == null) {
                return false;
            }
            if (searchView.mSearchSrcTextView.isPopupShowing() && ((SearchView) this.a).mSearchSrcTextView.getListSelection() != -1) {
                return ((SearchView) this.a).onSuggestionsKey(view, i, keyEvent);
            }
            if (TextUtils.getTrimmedLength(((SearchView) this.a).mSearchSrcTextView.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = (SearchView) this.a;
            searchView2.launchQuerySearch(0, null, searchView2.mSearchSrcTextView.getText().toString());
            return true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        SeekBarPreference seekBarPreference = (SeekBarPreference) this.a;
        if ((!seekBarPreference.e && (i == 21 || i == 22)) || i == 23 || i == 66) {
            return false;
        }
        SeekBar seekBar = seekBarPreference.d;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
        return seekBar.onKeyDown(i, keyEvent);
    }

    public gga(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
