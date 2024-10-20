package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kn extends EditText implements edj {
    private final ki a;
    private final lg b;
    private final egu c;
    private final fcp d;
    private final fdx e;
    private qdq f;

    public kn(Context context) {
        this(context, null);
    }

    private final qdq b() {
        if (this.f == null) {
            this.f = new qdq(this, null);
        }
        return this.f;
    }

    @Override // defpackage.edj
    public final ecv a(ecv ecvVar) {
        return this.c.a(this, ecvVar);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ki kiVar = this.a;
        if (kiVar != null) {
            kiVar.a();
        }
        lg lgVar = this.b;
        if (lgVar != null) {
            lgVar.e();
        }
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return efn.b(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        fcp fcpVar;
        if (Build.VERSION.SDK_INT < 28 && (fcpVar = this.d) != null) {
            return fcpVar.k();
        }
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] t;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        lg.r(this, onCreateInputConnection, editorInfo);
        ef.h(onCreateInputConnection, editorInfo, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (t = eek.t(this)) != null) {
            editorInfo.contentMimeTypes = t;
            onCreateInputConnection = egl.b(onCreateInputConnection, editorInfo, new zxb(this, 1));
        }
        return this.e.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 30 && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        ecq ecrVar;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && eek.t(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                toString();
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=".concat(toString()));
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                activity.requestDragAndDropPermissions(dragEvent);
                int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                beginBatchEdit();
                try {
                    Selection.setSelection((Spannable) getText(), offsetForPosition);
                    ClipData clipData = dragEvent.getClipData();
                    if (Build.VERSION.SDK_INT >= 31) {
                        ecrVar = new ecp(clipData, 3);
                    } else {
                        ecrVar = new ecr(clipData, 3);
                    }
                    eek.d(this, dye.d(ecrVar));
                    return true;
                } finally {
                    endBatchEdit();
                }
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        ecq ecrVar;
        int i2;
        if (Build.VERSION.SDK_INT < 31 && eek.t(this) != null) {
            if (i != 16908322) {
                if (i == 16908337) {
                    i = 16908337;
                }
            }
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (Build.VERSION.SDK_INT >= 31) {
                    ecrVar = new ecp(primaryClip, 1);
                } else {
                    ecrVar = new ecr(primaryClip, 1);
                }
                if (i == 16908322) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                ecrVar.d(i2);
                eek.d(this, dye.d(ecrVar));
            }
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ki kiVar = this.a;
        if (kiVar != null) {
            kiVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ki kiVar = this.a;
        if (kiVar != null) {
            kiVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        lg lgVar = this.b;
        if (lgVar != null) {
            lgVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        lg lgVar = this.b;
        if (lgVar != null) {
            lgVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(efn.c(this, callback));
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(fdx.f(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        lg lgVar = this.b;
        if (lgVar != null) {
            lgVar.i(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        fcp fcpVar;
        if (Build.VERSION.SDK_INT < 28 && (fcpVar = this.d) != null) {
            fcpVar.b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public kn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        pt.a(context);
        pr.d(this, getContext());
        ki kiVar = new ki(this);
        this.a = kiVar;
        kiVar.b(attributeSet, i);
        lg lgVar = new lg(this);
        this.b = lgVar;
        lgVar.h(attributeSet, i);
        lgVar.e();
        this.d = new fcp(this);
        this.c = new egu();
        fdx fdxVar = new fdx(this);
        this.e = fdxVar;
        fdxVar.d(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (fdx.e(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener f = fdx.f(keyListener);
            if (f == keyListener) {
                return;
            }
            super.setKeyListener(f);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }
}
