package defpackage;

import android.database.Cursor;
import android.database.CursorWrapper;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class udt extends CursorWrapper {
    private boolean a;

    public udt(Cursor cursor) {
        super(cursor);
    }

    private final aksa a(String str) {
        if (this.a) {
            return new akqh(1);
        }
        return aktp.e(str);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getCount() {
        aksa a = a("DatabaseWrapperSpanCursor#getCount");
        try {
            this.a = true;
            int count = getWrappedCursor().getCount();
            a.close();
            return count;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean move(int i) {
        aksa a = a("DatabaseWrapperSpanCursor#move");
        try {
            boolean move = getWrappedCursor().move(i);
            a.close();
            return move;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToFirst() {
        aksa a = a("DatabaseWrapperSpanCursor#moveToFirst");
        try {
            boolean moveToFirst = getWrappedCursor().moveToFirst();
            a.close();
            return moveToFirst;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToLast() {
        aksa a = a("DatabaseWrapperSpanCursor#moveToLast");
        try {
            boolean moveToLast = getWrappedCursor().moveToLast();
            a.close();
            return moveToLast;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToNext() {
        aksa a = a("DatabaseWrapperSpanCursor#moveToNext");
        try {
            boolean moveToNext = getWrappedCursor().moveToNext();
            a.close();
            return moveToNext;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPosition(int i) {
        aksa a = a("DatabaseWrapperSpanCursor#moveToPosition");
        try {
            boolean moveToPosition = getWrappedCursor().moveToPosition(i);
            a.close();
            return moveToPosition;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPrevious() {
        aksa a = a("DatabaseWrapperSpanCursor#moveToPrevious");
        try {
            boolean moveToPrevious = getWrappedCursor().moveToPrevious();
            a.close();
            return moveToPrevious;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
