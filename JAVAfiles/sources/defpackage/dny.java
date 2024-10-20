package defpackage;

import android.os.Handler;
import android.view.inputmethod.InputConnection;

/* compiled from: PG */
/* loaded from: classes.dex */
class dny extends dnx {
    public dny(InputConnection inputConnection, arqr arqrVar) {
        super(inputConnection, arqrVar);
    }

    @Override // defpackage.dnx
    protected final void b(InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    @Override // defpackage.dnx, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean deleteSurroundingTextInCodePoints;
        InputConnection inputConnection = this.a;
        if (inputConnection == null) {
            return false;
        }
        deleteSurroundingTextInCodePoints = inputConnection.deleteSurroundingTextInCodePoints(i, i2);
        return deleteSurroundingTextInCodePoints;
    }

    @Override // defpackage.dnx, android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }
}
