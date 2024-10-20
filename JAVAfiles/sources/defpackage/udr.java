package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioManager;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class udr implements uco {
    public final armf a;
    private final AudioManager b;

    public udr(Context context, armf armfVar) {
        this.b = (AudioManager) context.getSystemService("audio");
        this.a = armfVar;
    }

    @Override // defpackage.uco
    public final /* synthetic */ int e(Exception exc, int i, ude udeVar) {
        return 1;
    }

    @Override // defpackage.uco
    public final Closeable l(ude udeVar) {
        if (((ykw) this.a.b()).q("sound_for_debug_plugin_enabled_key", false) && this.b != null) {
            switch (udeVar.b) {
                case QUERY:
                case READ:
                    this.b.playSoundEffect(1);
                    return null;
                case WRITE:
                case INSERT:
                case DELETE:
                case UPDATE:
                    this.b.playSoundEffect(2);
                    return null;
                case BEGIN_TRANSACTION:
                    this.b.playSoundEffect(9);
                    return null;
                default:
                    return null;
            }
        }
        return null;
    }

    @Override // defpackage.uco
    public final boolean n() {
        return xyp.c();
    }

    @Override // defpackage.uco
    public final /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.uco
    public final /* synthetic */ Cursor a(Cursor cursor, ude udeVar) {
        return cursor;
    }
}
