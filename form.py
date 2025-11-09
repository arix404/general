import tkinter as tk


def submit():
    print("Name",name_entry.get())
    print("gender",gender_var.get())
    print("subjects",[subjects_list.get(i) for i in subjects_list.curselection()])
    print("agree",agree_var.get())
    tk.Label(root, text="Form submitted successfully!", fg="green").pack(pady=10)

root=tk.Tk()
root.title("student form")
root.geometry("400x600")


tk.Label(root,text="name").pack()
name_entry=tk.Entry(root)
name_entry.pack()


tk.Label(root,text="gender").pack()
gender_var=tk.StringVar()
tk.Checkbutton(root,text="male",variable=gender_var,onvalue="male",offvalue="").pack()
tk.Checkbutton(root,text="female",variable=gender_var,onvalue="female",offvalue="").pack()


tk.Label(root,text="subjects").pack()
subjects_list=tk.Listbox(root,selectmode=tk.MULTIPLE)
for subject in ["math","science","english"]:
    subjects_list.insert(tk.END,subject)
subjects_list.pack()


agree_var=tk.IntVar()
tk.Checkbutton(root,text="i agree",variable=agree_var).pack()


sb=tk.Button(root,text="submit",command=submit)
sb.pack()


root.mainloop()