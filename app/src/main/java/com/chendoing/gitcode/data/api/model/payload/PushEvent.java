package com.chendoing.gitcode.data.api.model.payload;

import com.chendoing.gitcode.R;
import com.chendoing.gitcode.data.api.model.User;

public class PushEvent extends Payloaded {

    private String ref;
    private String before;
    private String after;
    private boolean create;
    private boolean deleted;
    private boolean forced;
    private String base_ref;
    private String compare;

    private Object commits;

    private Object head_commit;

    private User pusher;

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public boolean isCreate() {
        return create;
    }

    public void setCreate(boolean create) {
        this.create = create;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean isForced() {
        return forced;
    }

    public void setForced(boolean forced) {
        this.forced = forced;
    }

    public String getBase_ref() {
        return base_ref;
    }

    public void setBase_ref(String base_ref) {
        this.base_ref = base_ref;
    }

    public String getCompare() {
        return compare;
    }

    public void setCompare(String compare) {
        this.compare = compare;
    }

    public Object getCommits() {
        return commits;
    }

    public void setCommits(Object commits) {
        this.commits = commits;
    }

    public Object getHead_commit() {
        return head_commit;
    }

    public void setHead_commit(Object head_commit) {
        this.head_commit = head_commit;
    }

    public User getPusher() {
        return pusher;
    }

    public void setPusher(User pusher) {
        this.pusher = pusher;
    }

    @Override
    public String toString() {
        return "PushPayload{" +
                "ref='" + ref + '\'' +
                ", before='" + before + '\'' +
                ", after='" + after + '\'' +
                ", create=" + create +
                ", deleted=" + deleted +
                ", forced=" + forced +
                ", base_ref='" + base_ref + '\'' +
                ", compare='" + compare + '\'' +
                ", commits=" + commits +
                ", head_commit=" + head_commit +
                ", pusher=" + pusher +
                '}';
    }

    @Override
    public int getDrawable() {
        return R.drawable.mega_icon_push;
    }
}
