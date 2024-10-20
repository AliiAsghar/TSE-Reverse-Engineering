package defpackage;

import android.content.ContentProviderClient;
import android.database.Cursor;
import android.database.CursorWrapper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akcg extends CursorWrapper {
    private final ContentProviderClient a;
    private int b;

    public akcg(Cursor cursor, ContentProviderClient contentProviderClient) {
        super(cursor);
        this.b = -1;
        this.a = contentProviderClient;
    }

    private final int a() {
        int i = this.b;
        if (i == -1) {
            int count = getCount();
            this.b = count;
            return count;
        }
        return i;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            getWrappedCursor().close();
        } finally {
            this.a.release();
        }
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getCount() {
        int count = super.getCount();
        this.b = count;
        return count;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean move(int i) {
        int position = getPosition() + i;
        if (!super.move(i)) {
            if (position >= -1 && position <= a()) {
                throw new akcj();
            }
            return false;
        }
        return true;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToFirst() {
        if (!super.moveToFirst()) {
            if (a() == 0) {
                return false;
            }
            throw new akcj();
        }
        return true;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToLast() {
        if (!super.moveToLast()) {
            if (a() == 0) {
                return false;
            }
            throw new akcj();
        }
        return true;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToNext() {
        if (!super.moveToNext()) {
            if (isAfterLast()) {
                return false;
            }
            throw new akcj();
        }
        return true;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPosition(int i) {
        if (!super.moveToPosition(i)) {
            if (i >= 0 && i < a()) {
                throw new akcj();
            }
            return false;
        }
        return true;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPrevious() {
        if (!super.moveToPrevious()) {
            if (isBeforeFirst()) {
                return false;
            }
            throw new akcj();
        }
        return true;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean requery() {
        boolean requery = super.requery();
        if (requery) {
            getCount();
        }
        return requery;
    }

    public final String toString() {
        return getWrappedCursor().toString();
    }
}
