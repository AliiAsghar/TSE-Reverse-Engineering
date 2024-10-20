package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class egj extends InputConnectionWrapper {
    final /* synthetic */ egk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egj(InputConnection inputConnection, egk egkVar) {
        super(inputConnection, false);
        this.a = egkVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        efu efuVar = null;
        if (inputContentInfo != null) {
            efuVar = new efu(new efu(inputContentInfo, (byte[]) null), (byte[]) null);
        }
        if (this.a.a(efuVar, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
