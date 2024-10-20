package defpackage;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.TextView;
import androidx.preference.DialogPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gff extends bw implements DialogInterface.OnClickListener {
    private DialogPreference ag;
    private CharSequence ah;
    private CharSequence ai;
    private CharSequence aj;
    public int ak;
    private CharSequence al;
    private int am;
    private BitmapDrawable an;

    /* JADX INFO: Access modifiers changed from: protected */
    public void aM(View view) {
        int i;
        View findViewById = view.findViewById(R.id.message);
        if (findViewById != null) {
            CharSequence charSequence = this.al;
            if (!TextUtils.isEmpty(charSequence)) {
                i = 0;
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
            } else {
                i = 8;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    public abstract void aN(boolean z);

    protected boolean aQ() {
        return false;
    }

    public final DialogPreference aR() {
        if (this.ag == null) {
            this.ag = (DialogPreference) ((gep) fd()).a(A().getString("key"));
        }
        return this.ag;
    }

    @Override // defpackage.bw, defpackage.cg
    public void g(Bundle bundle) {
        super.g(bundle);
        eoz fd = fd();
        if (fd instanceof gep) {
            gep gepVar = (gep) fd;
            String string = A().getString("key");
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) gepVar.a(string);
                this.ag = dialogPreference;
                this.ah = dialogPreference.a;
                this.ai = dialogPreference.d;
                this.aj = dialogPreference.e;
                this.al = dialogPreference.b;
                this.am = dialogPreference.f;
                Drawable drawable = dialogPreference.c;
                if (drawable != null && !(drawable instanceof BitmapDrawable)) {
                    Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                    this.an = new BitmapDrawable(z(), createBitmap);
                    return;
                }
                this.an = (BitmapDrawable) drawable;
                return;
            }
            this.ah = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.ai = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.aj = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.al = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.am = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.an = new BitmapDrawable(z(), bitmap);
                return;
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    @Override // defpackage.bw
    public final Dialog gM(Bundle bundle) {
        WindowInsetsController windowInsetsController;
        this.ak = -2;
        eu euVar = new eu(y());
        euVar.setTitle(this.ah);
        euVar.b(this.an);
        euVar.i(this.ai, this);
        euVar.h(this.aj, this);
        y();
        int i = this.am;
        View view = null;
        if (i != 0) {
            view = I().inflate(i, (ViewGroup) null);
        }
        if (view != null) {
            aM(view);
            euVar.setView(view);
        } else {
            euVar.c(this.al);
        }
        eT(euVar);
        ev create = euVar.create();
        if (aQ()) {
            Window window = create.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                windowInsetsController = window.getDecorView().getWindowInsetsController();
                windowInsetsController.show(anf$$ExternalSyntheticApiModelOutline0.m());
            } else {
                aO();
            }
        }
        return create;
    }

    @Override // defpackage.bw, defpackage.cg
    public void j(Bundle bundle) {
        super.j(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.ah);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.ai);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.aj);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.al);
        bundle.putInt("PreferenceDialogFragment.layout", this.am);
        BitmapDrawable bitmapDrawable = this.an;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.ak = i;
    }

    @Override // defpackage.bw, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        boolean z;
        super.onDismiss(dialogInterface);
        if (this.ak == -1) {
            z = true;
        } else {
            z = false;
        }
        aN(z);
    }

    protected void aO() {
    }

    protected void eT(eu euVar) {
    }
}
