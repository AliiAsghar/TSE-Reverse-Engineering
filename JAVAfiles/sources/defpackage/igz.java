package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class igz {
    private static final alor e;
    public final cj a;
    public final armf b;
    public final armf c;
    public final armf d;
    private final armf f;
    private final armf g;
    private final armf h;
    private final aksr i;

    static {
        alok alokVar = new alok();
        ihe iheVar = ihe.BLOCK;
        Integer valueOf = Integer.valueOf(R.string.block_dialog_title_2024_05_10);
        alokVar.h(iheVar, valueOf);
        alokVar.h(ihe.RBM_BLOCK, valueOf);
        ihe iheVar2 = ihe.SPAM;
        Integer valueOf2 = Integer.valueOf(R.string.spam_dialog_title_2024_05_10);
        alokVar.h(iheVar2, valueOf2);
        alokVar.h(ihe.GROUP_SPAM, valueOf2);
        e = alokVar.b();
    }

    public igz(cj cjVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, aksr aksrVar, armf armfVar6) {
        this.a = cjVar;
        this.b = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.h = armfVar4;
        this.c = armfVar5;
        this.i = aksrVar;
        this.d = armfVar6;
    }

    public static IllegalArgumentException b(ihe iheVar) {
        return new IllegalArgumentException(String.format("Unknown DialogType: %s", iheVar));
    }

    private static ParticipantsTable.BindData e(ihg ihgVar) {
        return ihgVar.f.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final CharSequence a(ihg ihgVar) {
        if (uyh.a() && ihgVar.f.b() == 2) {
            String str = ihgVar.f.a().b;
            if (str != null) {
                return str.replace(' ', (char) 160);
            }
            return this.a.getString(R.string.no_business_name_fallback);
        }
        String J = e(ihgVar).J();
        if (TextUtils.isEmpty(J)) {
            J = this.a.getString(R.string.unknown_sender);
        }
        if (vcp.k(e(ihgVar))) {
            return J;
        }
        return ((xwr) this.h.b()).b(wfh.y(J.replace(' ', (char) 160)));
    }

    public final void c(Supplier supplier) {
        BlockAndReportSpamCallbacks blockAndReportSpamCallbacks = (BlockAndReportSpamCallbacks) this.b.b();
        blockAndReportSpamCallbacks.m = supplier;
        ((akbo) blockAndReportSpamCallbacks.g.b()).b(blockAndReportSpamCallbacks.j);
        ((akbo) blockAndReportSpamCallbacks.g.b()).b(blockAndReportSpamCallbacks.k);
        ((akbo) blockAndReportSpamCallbacks.g.b()).b(blockAndReportSpamCallbacks.l);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(final defpackage.ihg r24) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.igz.d(ihg):void");
    }
}
