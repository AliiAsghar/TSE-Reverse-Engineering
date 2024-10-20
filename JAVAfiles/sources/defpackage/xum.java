package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class xum {
    public static final utz a = uuh.r(159443725, "use_missing_attachment_view");
    public final yai b;
    protected final yti c;
    private final aksr d;
    private final yyb e = new yyb();

    /* JADX INFO: Access modifiers changed from: protected */
    public xum(yai yaiVar, yti ytiVar, aksr aksrVar) {
        this.b = yaiVar;
        this.c = ytiVar;
        this.d = aksrVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(View view, boolean z) {
        if (view != null) {
            view.setClickable(z);
            int i = 1;
            if (true != z) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }
    }

    private final znj h(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2) {
        boolean z = true;
        if (i2 != 7 && i2 != 9) {
            z = false;
        }
        d.s(z);
        int c = c(i, i2);
        int b = b(i2);
        View inflate = layoutInflater.inflate(c, viewGroup, false);
        return new znj((xun) inflate.findViewById(b), inflate, (byte[]) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int b(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int c(int i, int i2);

    protected znj d(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, PendingAttachmentData pendingAttachmentData) {
        throw null;
    }

    protected abstract znj e(LayoutInflater layoutInflater, MessagePartCoreData messagePartCoreData, ViewGroup viewGroup, int i);

    protected abstract znj f(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2);

    /* JADX WARN: Code restructure failed: missing block: B:42:0x004f, code lost:
    
        if (((android.view.View) r3).isClickable() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008c, code lost:
    
        if (((android.view.View) r2).isClickable() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b9, code lost:
    
        if (((android.view.View) r2).isClickable() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d0, code lost:
    
        if (((android.view.View) r3).isClickable() != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.znj g(android.view.LayoutInflater r19, com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r20, android.view.ViewGroup r21, int r22, defpackage.xuv r23) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xum.g(android.view.LayoutInflater, com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, android.view.ViewGroup, int, xuv):znj");
    }
}
