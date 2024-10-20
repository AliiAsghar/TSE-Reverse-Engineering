package defpackage;

import android.widget.SeekBar;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akso implements SeekBar.OnSeekBarChangeListener {
    boolean a;
    akrc b;
    final /* synthetic */ SeekBar.OnSeekBarChangeListener c;
    final /* synthetic */ String d = "AudioAttachmentView";
    final /* synthetic */ aksr e;

    public akso(aksr aksrVar, SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.c = onSeekBarChangeListener;
        this.e = aksrVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (!akqj.u() && z) {
            if (this.a) {
                akrc a = akqj.a(this.b);
                try {
                    this.c.onProgressChanged(seekBar, i, true);
                    return;
                } finally {
                    akqj.a(a);
                }
            }
            akrc b = this.e.b(this.d.concat("#onProgressChanged"));
            try {
                this.c.onProgressChanged(seekBar, i, true);
                b.close();
                return;
            } catch (Throwable th) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        this.c.onProgressChanged(seekBar, i, z);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.a = true;
        if (akqj.u()) {
            akrh e = aktp.e(this.d.concat("#onStartTrackingTouch"));
            try {
                this.b = e.a;
                this.c.onStartTrackingTouch(seekBar);
                e.close();
                return;
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        akrc b = this.e.b(this.d.concat("#onStartTrackingTouch"));
        try {
            this.b = b;
            this.c.onStartTrackingTouch(seekBar);
            b.close();
        } catch (Throwable th3) {
            try {
                b.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a = false;
        akrc a = akqj.a(this.b);
        try {
            this.c.onStopTrackingTouch(seekBar);
        } finally {
            akqj.a(a);
            this.b = null;
        }
    }
}
