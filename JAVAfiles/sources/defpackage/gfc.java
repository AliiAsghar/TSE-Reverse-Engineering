package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfc implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
    private final Preference a;

    public gfc(Preference preference) {
        this.a = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.a;
        CharSequence m = preference.m();
        if (preference.x && !TextUtils.isEmpty(m)) {
            contextMenu.setHeaderTitle(m);
            contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        ClipboardManager clipboardManager = (ClipboardManager) this.a.j.getSystemService("clipboard");
        CharSequence m = this.a.m();
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", m));
        if (Build.VERSION.SDK_INT <= 32) {
            Context context = this.a.j;
            Toast.makeText(context, context.getString(R.string.preference_copied, m), 0).show();
        }
        return true;
    }
}
